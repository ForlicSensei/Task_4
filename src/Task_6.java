public class Task_6 {

    public static void main(String[] args) {
        System.out.println(bugger(39));
    }
    public static int bugger(int number){
        int SumNumber;
        int sum=0;
        while (number>=10){
            SumNumber=number;
            while (SumNumber>0){
                SumNumber %= 10;
                sum*=SumNumber;
            }
            number=sum;
            System.out.println(number);
        }
       return number;
    }
}
