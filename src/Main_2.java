import java.lang.System;
import java.util.Scanner;


public class Main_2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Введіть ваше число: ");
        String chislo = data.nextLine();
        char[] charArray = chislo.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + ", ");

        }
    }
}
