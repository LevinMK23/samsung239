package module1.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class LastTaskStepik {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        if(args.length < 1){
            System.out.println("GG WP");
        }
        else if(args[0].equals("+")) {
            System.out.println("Введите значение А ");
            int a = in.nextInt();
            System.out.println("Введите значение B ");
            int b = in.nextInt();
            System.out.println("Сумма двух чисел равна " + (a + b));
        }
        else {
            System.out.println("Введите значение А ");
            int a = in.nextInt();
            System.out.println("Введите значение B ");
            int b = in.nextInt();
            System.out.println("Разность двух чисел равна " + (a - b));
        }

    }
}
