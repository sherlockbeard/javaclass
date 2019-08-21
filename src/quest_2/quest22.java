package quest_2;

import java.util.Scanner;

public class quest22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius and height of cylinder");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius*radius*Math.PI;
        double volume = area * length;
        System.out.println("The area is "+area);
        System.out.println("THe volume is "+volume);
    }
}
