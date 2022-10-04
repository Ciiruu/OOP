package PBO.OOP.array_object_class;

public class Kucing {
    int jumlahkaki;
    String nama;
    String ras;
    String Warna;

    // disini harus menyertakan kucing kosongan baru ga erorr
    Kucing() {

    }

    Kucing(String nama, String ras, String warna, int jumlahkaki) {
        this.nama = nama;
        this.ras = ras;
        this.Warna = warna;
        this.jumlahkaki = jumlahkaki;
    }

    void cetakprofil() {
        System.out.println("Nama   :" + this.nama);
        System.out.println("Ras    :" + this.ras);
        System.out.println("Warna  :" + this.Warna);
        System.out.println("Jumlah kaki :" + this.jumlahkaki);

    }

    void berjalan() {
        System.out.println(this.nama + "ayo berjalan");
    }

    void melompat() {
        System.out.println(this.nama + " ayo melompat");

    }

    void berbicara() {
        System.out.println(this.nama + "meoww");

    }
}
