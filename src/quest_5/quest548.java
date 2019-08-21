package quest_5;

import java.util.Scanner;

public class quest548 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = "";
        for(int i=0;i<a.length();i+=2){
            b += a.charAt(i);
        }
        System.out.println(b);
    }
}
