package PBO.OOP.flow_control;

import java.util.Scanner;

public class TugasNO1 {
    public static void main(String[] args) {
        int angka, a = 0, b = 0;
        System.out.println("==== Si Paling besar ====");
        Scanner input = new Scanner(System.in);
        System.out.print("");
        a = input.nextInt();
        b = input.nextInt();
        if (a > b) {
            System.out.print("1");
        } else {
            System.out.println("0");
        }
    }
}
