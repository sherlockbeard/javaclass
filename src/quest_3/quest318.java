package quest_3;

import java.util.Scanner;

public class quest318 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;
        do {
            System.out.print("Enter the package weight (lbs): ");
            weight = input.nextDouble();
        } while (weight < 0);

        if (weight > 50) {
            System.out.println("The package cannot be shipped.");
            System.exit(1);
        }

        double cost = getShippingCost(weight);

        System.out.printf("The shipping cost is $%.2f\n", cost);
    }

    private static double getShippingCost(double weight) {
        double cost = 0.0;
        if (weight <= 1)
            cost = 3.5;
        else if (weight <= 3)
            cost = 5.5;
        else if (weight <= 10)
            cost = 8.5;
        else
            cost = 10.5;

        return cost;
    }
}


