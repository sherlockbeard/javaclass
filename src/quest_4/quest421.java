package quest_4;

import java.util.Scanner;

public class quest421 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String s = scanner.nextLine();
        int j=0;
        if(s.toCharArray()[3]=='-'){
            if(s.toCharArray()[6]=='-'){
                for(int i=0;i<s.length();i++){
                    if(i!=3 && i!=6){
                        if(Character.isDigit(s.charAt(i))){
                            j=1;
                        }
                        j=0;
                    }
                }

                j=1;
            }
        }
        if(j==1){
            System.out.println(s+" is a valid social security number");
        }
        else{
            System.out.println(s+" is not a valid social security number");

        }
    }
}
