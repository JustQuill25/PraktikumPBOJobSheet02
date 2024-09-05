package tugas;

public class DemoCar {
    public static void main(String[] args) {
        // Instansiasi objek Car pertama
        Car car1 = new Car("Toyota", "Red", "Petrol", 180);

        // Instansiasi objek Car kedua
        Car car2 = new Car("Honda", "Blue", "Diesel", 200);

        // Update nilai atribut
        car1 = new Car("Toyota", "Black", "Electric", 190); // Mengubah atribut mobil 1

        car2 = new Car("Honda", "Green", "Hybrid", 210); // Mengubah atribut mobil 2

        // Eksekusi method
        car1.displayInfo();
        car1.drive();
        car1.brake();
        car1.park();
        System.out.println(); // Baris kosong sebagai pemisah

        car2.displayInfo();
        car2.drive();
        car2.brake();
        car2.park();
    }
}
