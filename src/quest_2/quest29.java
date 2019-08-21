package quest_2;

import java.util.Scanner;

public class quest29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter c0, v1, and t:");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double av_acc = (v1-v0)/t;
        System.out.println(" The average acc "+av_acc);
    }
}
