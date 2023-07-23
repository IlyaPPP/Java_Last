public class Laptop {

    private String brand;
    private String model;
    private int version;
    private int year;
    private int price;
    private String OS;
    private int SSD;
    private int ram;
    private String color;
    public Integer getBrand;

    public Laptop(String brand, String model, int version, int year,
            int price, String OS, int SSD, int ram, String color) {
        this.brand = brand;
        this.model = model;
        this.version = version;
        this.year = year;
        this.price = price;
        this.OS = OS;
        this.SSD = SSD;
        this.ram = ram;
        this.color = color;
    }

    public String toString() {
        return "brand: " + this.brand + ", model: " + this.model + ", version: " + this.version + ", year: " + this.year
                + ", price: " + this.price + "$, OS: " + this.OS + ", hurdDisc: " + this.SSD + " GB, ram: "
                + this.ram
                + " GB, color: " + this.color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getVersion() {
        return version;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getOS() {
        return OS;
    }

    public int getSSD() {
        return SSD;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

}
