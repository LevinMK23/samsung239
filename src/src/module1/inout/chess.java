import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        char [][] field = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                field[i][j] = '-';
            }
        }
        Scanner in = new Scanner(System.in);
        int prX = 0, prY = 1;
        field[0][1] = 'K';
        printField(field);
        while(true) {
            System.out.println("Ходи!");
            String s = in.next();
            int pY = s.charAt(0) - 'A', pX = s.charAt(1) - '1';
            System.out.println(pX + " " + pY);
            if(true){
                field[pX][pY] = 'K';
                field[prX][prY] = '-';
                prX = pX; prY = pY;
                printField(field);
            }
            else{
                System.out.println("Такой ход невозможен!");
                continue;
            }
        }
    }

    static void printField(char [][] a){
        System.out.print("  ");
        for (char i = 'A'; i <= 'H'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(i+1 + " ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
