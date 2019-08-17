package quest_4;

import java.util.Scanner;

public class quest48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        int a  = scanner.nextInt();
        char b = (char) a;
        System.out.println("The character for ASCII code 69 is "+b);
    }
}
