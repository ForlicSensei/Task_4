import java.sql.SQLOutput;

public class Task_5 {
    public static void main(String[] args) {
        BMI("205 pounds", "73 inches");
    }
    public static String BMI(String ves, String height){
        String[] vesSplit = ves.split(" ");
        String[] heightSplit = height.split(" ");
        double ValueVes=Double.parseDouble(vesSplit[0]);
        System.out.println(ValueVes);
        double ValueHeight=Double.parseDouble(heightSplit[0]);
        System.out.println(ValueHeight);
        if (vesSplit[1].equals("pounds"))
            ValueVes*=0.45;
        System.out.println(ValueVes);
        if (heightSplit[1].equals("inches"))
            ValueHeight*=0.025;
        System.out.println(ValueHeight);
        double bmi=ValueVes/Math.pow(ValueHeight,2);
        if (bmi < 18.5)
            System.out.println(bmi+" Underweight");
        else if (bmi>25)
            System.out.println(bmi+" Overweight");
        else
            System.out.println(bmi+" Normal weight");
        return null;
    }
}
