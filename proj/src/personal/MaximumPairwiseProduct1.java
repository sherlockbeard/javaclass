package personal;

import java.util.Random;
import java.util.Scanner;


public class MaximumPairwiseProduct1 {

    static  long maxpairslow(long[] a){
        long product =0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                product = Math.max(product,a[i]*a[j]);
            }
        }
        return product;
    }



    static long maxpairfast(long[] a){
        int index1 = 0;
        for (int i=1;i<a.length;i++) {
            if (a[i] > a[index1]) {
                index1 = i;
            }
        }
            int index2;
            if(index1==0){
                index2 = 1;
            }else{
                index2 = 0;
            }
            for(int i=0;i<a.length;i++){
                if(i!=index1 && a[i]>a[index2]){
                    index2 = i;
                }
            }
            return  a[index1]*a[index2];
    }


    public static void main(String[] args) {
        while (true) {

            Random random = new Random();
            int n = random.nextInt(10) + 2;
            System.out.println(n);
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = random.nextInt(1000000);
                System.out.print(a[i] + " ");
            }
            long r1 = maxpairfast(a);
            long r2 = maxpairslow(a);
            if (r1 == r2) {
                System.out.println("Right result");
            } else {
                System.out.println("Wrong result"+r1+" "+r2);
                break;
            }
        }
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        long n = input.nextInt();
        long[] a = new long[n];
        for(long i = 0;i<n;i++){
            a[i] = input.nextInt();
        }
        System.out.println("The reslut is "+maxpairfast(a));
        */
    }
}
