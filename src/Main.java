import Model.Dosen;
import Model.Mahasiswa;
import Model.MataKuliah;
import koneksi.Database;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ini program main");
        Database.hubungkan();
        Dosen.tampilanInfo();
        Mahasiswa.tampilanInfo();
        MataKuliah.tampilanInfo();
    }
}