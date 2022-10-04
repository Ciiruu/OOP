package PBO.OOP.flow_control;

import java.util.Scanner;

public class TugasNO5 {
    public static void main(String[] args) {

        System.out.println("==== Berjumlah ====");
        int a, b, c, T, i, j, k;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        T = input.nextInt();
        if ((a + b + c) <= T) {
            for (i = 0; i <= T; i++) {
                for (j = 0; j <= T; j++) {
                    for (k = 0; k <= T; k++) {
                        if (((a * i) + (b * j) + (c * k)) == T) {
                            System.out.print(" " + i);
                            System.out.print(" " + j);
                            System.out.print(" " + k);
                            System.out.println(" ");

                        }
                    }
                }
            }

        } else {
            System.out.println("Mustahil");
        }

    }

}
