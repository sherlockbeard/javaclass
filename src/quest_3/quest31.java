package quest_3;

import java.util.Scanner;

public class quest31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of a b c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double r1 = (-b + Math.pow(Math.pow(b,2)-4*a*c,0.5))/2;
        double r2 = (-b + Math.pow(Math.pow(b,2)-4*a*c,0.5))/2;
        System.out.println("The roots are"+r1+" and "+r2);
    }
}
