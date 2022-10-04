package PBO.OOP.Operation_Text;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        int a;
        String kalimat[] = new String[50];
        Scanner jumlah = new Scanner(System.in);
        System.out.print("Input berapa kali: ");
        a = jumlah.nextInt();
        jumlah.nextLine();
        for (int i = 0; i < a; i++) {
            Scanner x = new Scanner(System.in);
            String var = jumlah.nextLine();
            kalimat[i] = var;
            String besar = var.toUpperCase();
            System.out.println(besar);

        }

    }
}
