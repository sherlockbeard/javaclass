package personal;

import java.util.Scanner;

public class binarystring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a;
        long b;
        long l;
        l= scanner.nextLong();

        for(int i=0;i<l;++i) {
            a = scanner.nextLong();
            b = scanner.nextLong();
            long answer = 0;
            long tar = a * b;
            long t2;
            if (b == 1) {
                t2 = 2;
            } else {
                t2 = 1;
            }
            long t1 = tar - 1;
            for (; t1 > 0; --t1) {
                if (t1 == a) t1--;
                if (t2 == b) t2++;
                if (t1 == 0) break;
                if ((t1 * t2) < tar) {
                    t2++;
                    answer++;
                }
            }

            System.out.println(answer);
        }
    }
}
