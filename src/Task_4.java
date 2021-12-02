public class Task_4 {
    public static void main(String[] args) {
        double[] par={13.25, 15, 30, 1.5};
        System.out.println(OverTime(par));
    }
    public static double OverTime(double[] parameter){
        double Over = parameter[1]-17;
        double Time = 17 - parameter[0];
        double Sum=0;
        if (Over > 0 ){
            Sum+=Over*parameter[3]*parameter[2];
        }else
        {
            Time=parameter[1]-parameter[0];
        }
        Sum+=parameter[2]*Time;
        return Sum;
    }
}
