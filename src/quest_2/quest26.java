package quest_2;

import java.util.Scanner;

public class quest26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENter a number between 0 and 1000");
        int num = input.nextInt();
        int total =0;
        while(num!=0){
            int rem = num%10;
            total+=rem;
            num/=10;
        }
        System.out.println(total);
    }
}
