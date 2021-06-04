import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataType{
 public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);	

	String namaDepan = "SANDY THREE";
	String namaTengah = "MU'AZ";
	String namaBelakang = "PUTRA";
	int usia = 21;
	int targetTahunKuliah = 4;
	double ipk = 3.5;
	boolean lulus = true;
	char nilaiAbjad = 'A';

	System.out.println("============================INPUT============================");
	System.out.print("Input Nama Depan : ");
	namaDepan = input.nextLine(); 
	System.out.print("Input Usia : ");
	usia = input.nextInt(); 
	System.out.print("Input IPK : ");
	ipk = input.nextDouble(); 
	System.out.print("");
	System.out.print("Input Nilai Abjad : ");
	nilaiAbjad = input.next().charAt(0); 
	System.out.print("Lulus : ");
	lulus = input.nextBoolean(); 


	System.out.println("============================OUTPUT============================");
	System.out.println("Nama Depan : "+namaDepan);
	System.out.println("Nama Tengah : "+namaTengah);
	System.out.println("Nama Belakang : "+namaBelakang);
	System.out.println("Usia : "+usia);
	System.out.println("Target Tahun Kuliah : "+targetTahunKuliah);
	System.out.println("IPK : "+ipk);
	System.out.println("Lulus : "+lulus);
	System.out.println("Nilai Abjad : "+nilaiAbjad);
	
	JOptionPane.showMessageDialog(null, "Hai, "+ namaDepan + namaTengah + namaBelakang);
	}	
}