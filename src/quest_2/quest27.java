package quest_2;

import java.util.Scanner;

public class quest27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of min: ");
        double min = input.nextDouble();
        double hr = min/60;
        double day = hr/24;
        double year = day/365;

        double min2 = min%60;
        hr = hr%24;
        day = day%365;

        System.out.println(min+ " minutes is approx "+(int)year+" years and "+ (int)day +"  days ");
    }
}
