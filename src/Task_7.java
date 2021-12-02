public class Task_7 {
    public static void main(String[] args) {
        System.out.println(toStarShorthand("abbccc"));
    }
    public static String toStarShorthand(String s){
        char[] ch=s.toCharArray();
        String str="";
        str+=ch[0];
        int n=0;
        for (int i=1;i<ch.length;i++){
            if (ch[i-1] == ch[i]){
                n++;
            }else
            {
                if(n!=0){
                    n++;
                    str+="*"+n;
                }
                str+=ch[i];
                n=0;
            }
        }
        if(n!=0){
            n++;
            str+="*"+n;
        }
        return str;
    }
}
