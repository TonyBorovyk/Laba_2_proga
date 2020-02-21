import java.lang.System;
import java.lang.String;
import java.util.Random;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введіть к-сть рядочків матриці: ");
        int k = number.nextInt();
        int[] matrix = new int[k];
        for (int i = 0; i < k; i++) {
            matrix[i] = rand.nextInt(20) - 10;
        }
        output(matrix);
        for (int i = matrix.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (matrix[j] > matrix[j + 1]) {
                    int tmp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = tmp;
                }
            }
        }
        output(matrix);

    }


    public static void output(int[] arr) {
        System.out.println("Ваша матриця: ");
        int p = 0;
        while (p < arr.length) {
            System.out.printf("%4d", arr[p]);
            p++;
        }
        System.out.println();
    }
}
