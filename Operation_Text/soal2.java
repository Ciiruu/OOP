package PBO.OOP.Operation_Text;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        int i, panjang, jumlah;
        String kalimat = new String();
        System.out.println("masukan kalimat");
        Scanner input = new Scanner(System.in);
        kalimat = input.nextLine();
        jumlah = 0;
        for (i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == 'a' || kalimat.charAt(i) == 'i' || kalimat.charAt(i) == 'u'
                    || kalimat.charAt(i) == 'e' || kalimat.charAt(i) == 'o') {
                jumlah++;
            }
        }
        System.out.println("jumlah huruf vokal: " + jumlah);

    }
}
