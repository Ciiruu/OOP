package PBO.OOP.Operation_Text;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        String original, reverse = "";

        System.out.println("soal 5");
        Scanner input = new Scanner(System.in);
        System.out.print("masukan kata: ");
        original = input.nextLine();
        int lengt = original.length();
        for (int i = lengt - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
