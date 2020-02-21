import java.lang.System;
import java.util.Scanner;
import java.lang.Integer;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first, second;
        System.out.print("Введіть ваше число: ");
        first = input.nextInt();
        second = (first * 2);
        System.out.println( Integer.toString(first) + Integer.toString(second));

    }

}
