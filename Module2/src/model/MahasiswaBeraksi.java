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

        System.out.println("Nama \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Taggal Lahir \t : "+ simpleDateFormat.format(mahasiswa.tanggalLahir ));

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19636598";
        mahasiswa2.nama = "SANDY PUTRA";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("24-05-1999");

        System.out.println("Nama \t\t\t : " + mahasiswa2.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
        System.out.println("Taggal Lahir \t : "+ simpleDateFormat.format(mahasiswa2.tanggalLahir ));


    }
}
