

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row and column to find rectangel shape...");
        int row = sc.nextInt();
        int column = sc.nextInt();

        for ( int i=1; i<=row; i++) {
            for (int j=1; j<=column; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
