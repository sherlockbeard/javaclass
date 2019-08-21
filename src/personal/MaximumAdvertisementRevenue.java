package personal;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAdvertisementRevenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[] a = new int[q];
        int[] b = new int[q];
        for(int i=0;i<q;i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0;i<q;i++){
            b[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int[] c = new int[q];
        int sum =0;
        for(int i=0;i<q;i++){
            sum += a[i]*b[i];
        }
        System.out.print(sum);
    }
}
