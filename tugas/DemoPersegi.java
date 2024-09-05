package tugas;

public class DemoPersegi {
    public static void main(String[] args) {
        // Instansiasi objek PersegiPanjang
        PersegiPanjang pp = new PersegiPanjang(10, 5);

        // Tampilkan informasi panjang dan lebar
        pp.displayInfo();

        // Tampilkan luas
        System.out.println("Luas: " + pp.getLuas());

        // Tampilkan keliling
        System.out.println("Keliling: " + pp.getKeliling());
    }
}
