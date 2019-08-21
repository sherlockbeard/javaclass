package quest_2;

import java.util.Scanner;

public class quest210 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double mass = input.nextDouble();
        double in_temp = input.nextDouble();
        double fn_temp = input.nextDouble();
        double energy = mass*(fn_temp - in_temp)*4184;
        System.out.println(energy+" energy ");
    }
}
