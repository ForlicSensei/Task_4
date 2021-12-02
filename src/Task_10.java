/** Предположим, что пара одинаковых символов служит концами книги для всех символов между ними. Напишите функцию,
 * которая возвращает общее количество уникальных символов (книг, так сказать) между всеми парами концов книги.

 Эта функция будет выглядеть следующим образом:

 countUniqueBooks("stringSequence", "bookEnd")

 Пример:

 countUniqueBooks("AZYWABBCATTTA", 'A') ➞ 4

 // 1st bookend group: "AZYWA" : 3 unique books: "Z", "Y", "W"

 // 2nd bookend group: "ATTTA": 1 unique book: "T"

 countUniqueBooks("$AA$BBCATT$C$$B$", '$') ➞ 3

 countUniqueBooks("ZZABCDEF", 'Z') ➞ 0 **/

public class Task_10 {
    public static void main(String[] args) {
        System.out.println(countUniqueBooks("ZZABCDEF", 'Z'));
    }

    public static int countUniqueBooks(String str, char ChekCh) {
        char[] ch = str.toCharArray();
        String UniStr = "";
        char[] UniCh;
        int[] safe = new int[2];
        int num = 0,FakeNum=0;
        for (int i = 0, s = 0; i < ch.length; i++) {
            if (ch[i] == ChekCh) {
                safe[s] = i;
                s++;
            }
            if (s == 2) {
                for (int j = safe[0]; j != safe[1]; j++)
                    UniStr += ch[j];
                UniCh = UniStr.toCharArray();
                int meh = 0;
                System.out.println(num);
                for (int I = 0; I < UniCh.length; I++) {
                    meh++;
                    for (int j = I + 1; j < UniCh.length; j++) {
                        if (UniCh[I] == UniCh[j]) {
                            FakeNum++;
                            System.out.println("Sum = " + num);
                            break;
                        }
                    }
                }
                s = 0;
                num = meh - FakeNum;
                FakeNum=0;
            }
        }
        return num-1;
    }
}
