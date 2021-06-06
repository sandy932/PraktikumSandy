package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException{

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630385";
        mahasiswa.nama = "SANDY THREE MUAZ PUTRA";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("14-01-2000");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa("19636598", "SANDY PUTRA", "24-05-1999" );
        mahasiswa2.tampilkanAtribut();


    }
}
