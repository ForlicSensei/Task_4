public class Main {

    public static void main(String[] args) {
        System.out.println(bugger(39));
    }
    public static int bugger(int number){
        int SumNumber;
        int sum=1;
        while (number>=10){
            SumNumber=number;
            while (SumNumber>0){
                sum*= SumNumber%10;
                SumNumber = SumNumber / 10;
            }
            number=sum;
            sum=1;
        }
        return number;
    }
}
