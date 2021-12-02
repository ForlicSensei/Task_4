import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        CheckEsse(10,7);
    }
    public static void CheckEsse(int n,int k){
        int skip=0;
        Scanner in = new Scanner(System.in);
        String Esse = in.nextLine();
        String[] words= Esse.split(" ");
        if(words.length <= n)
            {
            for (int i=0;i<words.length;i++)
            {
                if (skip+words[i].length() <= k) {
                    System.out.print(words[i] + " ");
                }else{
                    System.out.println();
                    System.out.print(words[i]+ " ");
                    skip=0;
                }
                skip += words[i].length();
            }
            }
        else
            System.out.println("Ничего не вышло");
    }
}
