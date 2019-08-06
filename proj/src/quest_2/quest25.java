package quest_2;

import java.util.Scanner;

public class quest25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a  gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity_per = input.nextDouble();
        double gratuity = subtotal*gratuity_per/100;
        System.out.println("The gratuity is "+gratuity+" and total is $"+gratuity*10);

    }
}
