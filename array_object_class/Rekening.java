package PBO.OOP.array_object_class;

public class Rekening {
    String NO_Rekening = new String();
    String Nama_pemilik = new String();
    String Cabang = new String();
    Long saldo;

    void Isi_Data() {

    }

    void tarik(Long jt) {

        if (jt > saldo) {
            System.out.println("Saldo Anda Tidak Mencukupi!!!");
        } else if (jt <= saldo) {
            System.out.println("jumlah Yang Akan Ditarik: " + jt);
            System.out.println("Sisa Saldo Anda: " + (saldo - jt));
            saldo = saldo - jt;
        }

    }

    void setor(Long js) {
        System.out.println("jumlah Yang Akan Disetorkan: " + js);
        System.out.println("Saldo Anda saat ini: " + (saldo + js));
        saldo = saldo + js;
    }

    void ceksaldo() {
        System.out.println("NO Rekening     :" + this.NO_Rekening);
        System.out.println("saldo annda : " + saldo);
    }

    void transfer(Long tf) {
        System.out.println("Masukan No Rekening tujuan :" + tf);
        System.out.println("Nominal yang ingin diTransfer :" + (saldo - tf));
        saldo = saldo - tf;
    }

}
