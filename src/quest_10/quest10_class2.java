package quest_10;

import java.util.Scanner;

public class quest10_class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(change(a));
    }
    public static String change(String a){
        String b = "";
        char newnow ;
        for(int i=0;i<a.length();i++){
           char now = a.charAt(i);
           if(now>='a' && now<='z'){
               int nowa = now + 13;
               if(nowa>'z'){
                   newnow = (char) ((nowa - 'z')+'a'-1);
               }else{
                   newnow = (char) nowa;
               }
               b+= newnow;
           }else if(now>='A' && now<='Z'){
               int nowa = now + 13;
               if(nowa>'Z'){
                   newnow = (char) ((nowa - 'Z')+'A'-1);
               }else{
                   newnow = (char) nowa;
               }
               b+=newnow;
           }else if(now == ' '){
               b+=now;
           }
        }
        return b;
    }
}
