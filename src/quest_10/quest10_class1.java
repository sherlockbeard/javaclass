package quest_10;

import java.util.Scanner;

public class quest10_class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        System.out.println(isDupledrome(a));

    }
    public static boolean  isDupledrome(String a){
        if(a.length()%2!=0){
            return false;
        }
        for(int i=0;i<a.length();i+=2){
            if(a.charAt(i)!=a.charAt(i+1)){
                return false;
            }
        }
        return true;
    }


}
