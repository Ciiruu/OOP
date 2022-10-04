package PBO.OOP.flow_control;

import java.util.Scanner;

public class TugasNO4 {
    public static void main(String[] args) {

        System.out.println("==== Kuadran ====");
        int x, y;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else
            System.out.println("4");
    }
}
