package quest_8;

import java.util.Scanner;

public class quest82 {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();

        double x = 0;

        for (int col = 0; col < matrix[0].length; col++) {
            x += matrix[col][col];
        }

        System.out.println("Diagonal: " + x);
    }

    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        final int ROWS = 4;
        final int COLUMNS = 4;
        double[][] m = new double[ROWS][COLUMNS];

        System.out.println("Enter a " + ROWS + "-by-" +
                COLUMNS + " matrix row by row:");
        for (int row = 0; row < m.length; row++)
            for (int col = 0; col < m[row].length; col++)
                m[row][col] = input.nextDouble();
        return m;
    }
}
