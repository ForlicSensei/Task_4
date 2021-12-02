

public class Task_2 {
    public static void main(String[] args) {

        split("()()()");
    }

    public static void split(String Brackets){
        char[] bracket = Brackets.toCharArray();
        String str = "";
        for(char brack : bracket){
            str += brack;
            if(isBalance(str)){
                System.out.println(str);
                str="";
            }
        }
    }

    public static boolean isBalance(String str) {

        if (null == str || ((str.length() % 2) != 0)) {
            return false;
        } else {
            char[] ch = str.toCharArray();
            for (char c : ch) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                    return false;
                }
            }
        }
        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        return (str.length() == 0);
    }
}
