import model.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("19630689", "MUAZ", "06-02-2001" );
        m1.tampilkanAtribute();
        System.out.println(m1.getNama());
    }
}
