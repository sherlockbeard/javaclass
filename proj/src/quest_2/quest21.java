package quest_2;

import java.util.Scanner;

public class quest21 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));

        System.out.println("Enter the tempreature in celsius");
        double celsius = input.nextDouble();

        double fahrenheit = ((9.0/5.0)* celsius) + 32;

        System.out.println(fahrenheit+" Fahrenheit");
    }
}
