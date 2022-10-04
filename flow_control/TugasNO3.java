package PBO.OOP.flow_control;

import java.util.Scanner;

public class TugasNO3 {
    public static void main(String[] args) {
        System.out.println("==== Dua Pangkat ====");

        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        if ((x / 2) % 2 == 0) {
            System.out.println("ya");
        } else {
            System.out.println("bukan");
        }
    }
}
