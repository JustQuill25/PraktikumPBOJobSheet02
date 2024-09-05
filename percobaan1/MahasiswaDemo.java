package percobaan1;

public class MahasiswaDemo {
    public static void main(String[] args) {
        // Objek pertama
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        // Objek kedua
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Franklyn Bima";
        m2.alamat = "Blitar, Jawa Timur";
        m2.kelas = "2F";
        m2.displayBiodata();

        // Objek ketiga
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Jamiatul Afifah";
        m3.alamat = "Pasuruan";
        m3.kelas = "2F";
        m3.displayBiodata();
    }
}
