/**Создайте функцию, которая возвращает true, если две строки рифмуются, и false в противном случае.
 * Для целей этого упражнения две строки рифмуются, если последнее слово из каждого предложения содержит одни и те же гласные.

 Пример:

 doesRhyme("Sam I am!", "Green eggs and ham.") ➞ true

 doesRhyme("Sam I am!", "Green eggs and HAM.") ➞ true

 // Capitalization and punctuation should not matter.

 doesRhyme("You are off to the races", "a splendid day.") ➞ false

 doesRhyme("and frequently do?", "you gotta move.") ➞ false

 Примечание:

 – Без учета регистра.

 – Здесь мы не обращаем внимания на такие случаи, как "thyme" и "lime". (одна гласная не считается)

 – Мы также игнорируем такие случаи, как "away" и "today" (которые технически рифмуются, хотя и содержат разные гласные).
 **/

public class Task_8 {
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
    }
    public static boolean doesRhyme(String firstString, String secondString){
        String firstLastWord = firstString.substring(firstString.lastIndexOf(" ")+1);
        String secondLastWord = secondString.substring(secondString.lastIndexOf(" ")+1);
        int jCount = 0;
        int fNum = 0, sNum=0;
        for (int i = 0; i < firstLastWord.length(); i++) {
            if (Character.toString(firstLastWord.charAt(i)).matches("[AIOUEYaiouey]")){
                fNum++;
                for (int j = jCount; j < secondLastWord.length(); j++) {
                    jCount++;
                    if (Character.toString(secondLastWord.charAt(j)).matches("[AIOUEYaiouey]")){
                        if (secondLastWord.charAt(j) == firstLastWord.charAt(i)){
                            sNum++;
                            break;
                        }
                    }
                }
            }

        }
        return sNum==fNum;
    }
}
