
/** Создайте функцию, которая принимает два целых числа и возвращает true,
 * если число повторяется три раза подряд в любом месте в num1 и то же самое число повторяется два раза подряд в num2.

 Пример:

 trouble(451999277, 41177722899) ➞ True

 trouble(1222345, 12345) ➞ False

 trouble(666789, 12345667) ➞ True

 trouble(33789, 12345337) ➞ False **/
public class Task_9 {
    public static void main(String[] args) {
        System.out.println(trouble(666789, 12345667));

    }
    public static boolean trouble(int num1,int num2){
        String str1= String.valueOf(num1);
        String str2= String.valueOf(num2);
        char safe_num=' ';
        char[] ch=str1.toCharArray();
        for (int i=0;i<str1.length();i++){
            for (int j=0,n=0;j<str1.length();j++){
                if(ch[i]==ch[j])
                    n++;
                else n=0;
                if (n==3){
                    safe_num=ch[j];
                }
            }
        }
        if (safe_num == ' '){
            return false;
        }
        ch = str2.toCharArray();
        for (int i=0,n=0;i<str2.length();i++){
            if (ch[i] == safe_num){
                n++;
            }

            if (n == 2)
                return true;
        }

        return false;
    }
}
