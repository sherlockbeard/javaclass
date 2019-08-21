package personal;

import java.util.Scanner;

public class MaximumValueoftheLoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tw = scanner.nextInt();
        int[] p = new int[n];
        int[] w = new int[n];
        for(int i=0;i<n;i++){
            p[i] = scanner.nextInt();
            w[i] = scanner.nextInt();
        }
        double value =  get_value(tw,w,p);
        System.out.println(value);
    }

    private static double get_value(int tw, int[] w, int[] p) {
        double value  = 0.0;
        for(int i=0;i<w.length;i++){
            if(tw ==0) return value;
            int index = get_max_index(w,p);
            int a = Math.min(tw,w[index]);
            value += a*Double.valueOf(p[index])/Double.valueOf(w[index]);
            w[index] -= a;
            tw -= a;
        }
        return value;

    }

    private static int get_max_index(int[] w, int[] p) {
        int max_i = 0;
        double max = 0;
        for(int i = 0;i<w.length;i++){
            if(w[i]!=0&& Double.valueOf(p[i])/Double.valueOf(w[i])>max){
                max = Double.valueOf(p[i])/Double.valueOf(w[i]);
                max_i = i;
            }
        }
        return max_i;
    }
}
