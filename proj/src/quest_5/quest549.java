package quest_5;

import java.util.Scanner;

public class quest549 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = scanner.nextLine();
        int vowels=0;
        int constant =0;
        for(int i=0;i<a.length();i++){
            char b = a.charAt(i);
            if(b=='a'||b=='A'||b=='i'||b=='I'||b=='o'||b=='O'||b=='e'||b=='E'||b=='U'||b=='u'){
                vowels++;
            }else {
                constant++;
            }
        }
        System.out.println("The number of vowels is "+vowels);
        System.out.println("The number of consonants is "+constant);
    }
}
