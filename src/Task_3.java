public class Task_3 {
    public static void main(String[] args) {
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toSnakeCase("helloEdabit"));
    }

    public static String toCamelCase(String s){
        char[] ch=s.toCharArray();
        char Up;
        String NewS="";
        for (int i=0;i<ch.length;i++){
            if (ch[i] != '_'){
                NewS+=ch[i];
            }else{
               Up=Character.toUpperCase(ch[i+1]);
               NewS+=Up;
               i++;
            }
        }
        return NewS;
    }

    public static String toSnakeCase(String s){
        char[] ch=s.toCharArray();
        String NewS="";
        NewS+=ch[0];
        for (int i=1;i<ch.length;i++){
            if (!Character.isUpperCase(ch[i])){
                ch[i]=Character.toLowerCase(ch[i]);
                NewS+=ch[i];
            }else{
                NewS+='_';
                ch[i]=Character.toLowerCase(ch[i]);
                NewS+=ch[i];
            }
        }
        return NewS;
    }
}
