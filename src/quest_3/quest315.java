package quest_3;
import java.util.Scanner;

public class quest315 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        String numString = input.nextLine();

        displayLotteryOutcome(numString);
    }

    private static void displayLotteryOutcome(String numString) {
        int a = Integer.parseInt(numString.charAt(0) + "");
        int b = Integer.parseInt(numString.charAt(1) + "");
        int c = Integer.parseInt(numString.charAt(2) + "");
        int x = generateLottery();
        int y = generateLottery();
        int z = generateLottery();

        StringBuilder output = new StringBuilder();

        if (a == x && b == y && c == z) {
            output.append("Matched exact order: you win $10,000");
        } else if ((a == x && c == y && b == z) ||
                (b == x && c == y && a == z) ||
                (b == x && a == y && c == z) ||
                (c == x && a == y && b == z) ||
                (c == x && b == y && a == z)) {
            output.append("All digits match: you win $3,000");
        } else if ((a == x || a == y || a == z) ||
                (b == x || b == y || b == z) ||
                (c == x || c == y || c == z)) {
            output.append("At least one digit matches: you win $1,000");
        } else {
            output.append("Too bad! You win nothing!");
        }

        System.out.println("Lottery: " + x + y + z);
        System.out.println(output);
    }

    private static int generateLottery() {
        return (int)(Math.random() * 10);
    }
}