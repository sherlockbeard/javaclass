package quest_3;

import java.util.Scanner;

public class quest33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        if(a*b-b*c==0){
            System.out.println("Not sloveable");
            return;
        }else{
            double x = (((e*d)-(b*e))/((a*d)-(b*c)));
            double y = (((a*f)-(e*c))/((a*d)-(b*c)));
            System.out.println("x: "+x+"y: "+y);
        }
    }
}
