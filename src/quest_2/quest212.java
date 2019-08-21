package quest_2;

import java.util.Scanner;

public class quest212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double speed = input.nextDouble();
        double acc  = input.nextDouble();
        double len = (speed*speed)/(2*acc);
        System.out.println(len + " length");
    }
}
