package PBO.OOP.array_object_class;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Rekening menu = new Rekening();
        System.out.println("==== pengisian data ====");
        Scanner in = new Scanner(System.in);
        menu.Isi_Data();
        System.out.print("Masukan No Rekening     : ");
        menu.NO_Rekening = in.nextLine();

        System.out.print("Masukan nama pemilik    : ");
        menu.Nama_pemilik = in.nextLine();

        System.out.print("Cabang                  : ");
        menu.Cabang = in.nextLine();

        // System.out.print("masukan jumlah saldo : ");
        // menu.saldo = in.nextLong();

        System.out.println("==== menu layanan ====");
        int pilih;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1.Tarik");
            System.out.println("2.Setor");
            System.out.println("3.cel saldo");
            System.out.println("4.Transfer");
            System.out.print("Masukan pilihan : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Jumlah Uang Yang Akan Ditarik: ");
                    Scanner tarik = new Scanner(System.in);
                    Long jt = tarik.nextLong();
                    menu.tarik(jt);
                    break;

                case 2:
                    System.out.println("Masukkan Uang Setoran: ");
                    Scanner setor = new Scanner(System.in);
                    setor = new Scanner(System.in);
                    Long js = setor.nextLong();
                    menu.setor(js);
                    break;
                case 3:
                    menu.ceksaldo();
                    break;

                case 4:
                    System.out.println("Masukan jumlah yang ingin di Transfer");
                    Scanner transfer = new Scanner(System.in);
                    transfer = new Scanner(System.in);
                    Long tf = transfer.nextLong();
                    menu.transfer(tf);
                    break;
                default:
                    break;
            }
        } while (pilih != 4);

    }
}
