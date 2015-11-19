package javaapplication1;

import java.util.Scanner;

public class  Factorization {

    public static void main(String[] args) {
        int i, num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter Number or Enter 0 for exit : ");
            num = sc.nextInt();

            for (i = 2; i <= num; i++) {

                while (num % i == 0) {
                    num /= i;
                    System.out.print(i + " ");
                    if (i < num) {
                        System.out.print("x ");
                    }//if

                }//while

            }//for
            System.out.println("");
        } while (num != 0);

    }
}
