package quest_5;

import java.util.Scanner;

public class quest546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = scanner.nextLine();
        String b ="";
        for(int i=a.length()-1;i>=0;i--){
            b+= a.charAt(i);
        }
        System.out.println(b);
    }
}
