package quest_2;

import java.util.Scanner;

public class quest24 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kg = pounds* 0.454;
        System.out.println(pounds+" pounds is "+kg+" kilograms");
    }
}
