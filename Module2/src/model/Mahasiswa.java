package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggalLahir;
    final String POLA_TANGGAL = "dd-MM-yyyy";
    final SimpleDateFormat SDF = new SimpleDateFormat(POLA_TANGGAL);

    void tampilkanAtribut(){
        System.out.println("Nama \t\t\t : " + this.nama);
        System.out.println("NPM \t\t\t : " + this.npm);
        System.out.println("Tanggal Lahir \t : " + SDF.format(this.tanggalLahir));
    }

    public Mahasiswa(String npm, String nama, String tanggalLahir){
        this.npm = npm;
        this.nama =nama;
        try {
            this.tanggalLahir = SDF.parse(tanggalLahir);
        }catch (ParseException e){
            System.err.println("Kesalahan Pada Tanggal Lahir");
        }
    }
}
