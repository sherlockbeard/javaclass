package personal;

import java.util.Scanner;

public class sumof2 {
    static  double sumoftwo(double one,double two){
        return one+two;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the a and b value");
        double a  = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("THe sum of"+a+" + "+b+" = "+sumoftwo(a,b));
    }
}
