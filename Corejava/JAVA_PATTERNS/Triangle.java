import java.util.Scanner;

public class Triangle {

    static Scanner sc = new Scanner(System.in);

    public static void starPiramid_1() {
        System.out.println("Enter any value to find star trangle...");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

    public static void starPiramid_2() {
        System.out.println("Enter any value to find star trangle...");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=num; j>=i; j--) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

    public static void number_1Piramid() {
        System.out.println("Enter any value to find number trangle...");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

    public static void number_2Piramid() {
        System.out.println("Enter any value to find number trangle...");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }



    public static void main(String args[]) {
         starPiramid_1();
       starPiramid_2();
         number_1Piramid();
        number_2Piramid();
        
    }
}
