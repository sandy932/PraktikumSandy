import javax.swing.JOptionPane;

public class DataType{
	public static void main(String[]args){
	String namaDepan = "SANDY THREE";
	String namaTengah = "MU'AZ";
	String namaBelakang = "PUTRA";

	int usia = 21;
	int targetTahunKuliah = 4;
	double ipk = 3.5;
	boolean lulus = true;
	char nilaiAbjad = 'A';
 
	System.out.println("Nama Depan : "+namaDepan);
	System.out.println("Nama Tengah : "+namaTengah);
	System.out.println("Nama Belakang : "+namaBelakang);
	System.out.println("Usia : "+usia);
	System.out.println("Target Tahun Kuliah : "+targetTahunKuliah);
	System.out.println("IPK : "+ipk);
	System.out.println("Lulus : "+lulus);
	System.out.println("Nilai Abjad : "+nilaiAbjad);
	
	JOptionpane.showMessageDialog(null, "Hai, "+namaDepan+namaTengah+namaBelakang);
	}	
}