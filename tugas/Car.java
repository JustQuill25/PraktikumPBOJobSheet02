package tugas;

public class Car {
    // Atribut
    private String brand;
    private String color;
    private String engineType;
    private int maxSpeed;

    // Constructor
    public Car(String brand, String color, String engineType, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
    }

    // Method untuk mengemudikan mobil
    public void drive() {
        System.out.println(brand + " is driving.");
    }

    // Method untuk mengerem mobil
    public void brake() {
        System.out.println(brand + " is braking.");
    }

    // Method untuk memarkir mobil
    public void park() {
        System.out.println(brand + " is parked.");
    }

    // Method untuk menampilkan informasi mobil
    public void displayInfo() {
        System.out.println("Brand       : " + brand);
        System.out.println("Color       : " + color);
        System.out.println("Engine Type : " + engineType);
        System.out.println("Max Speed   : " + maxSpeed + " km/h");
    }
}
