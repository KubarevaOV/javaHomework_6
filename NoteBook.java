public class NoteBook {
    private String brand;
    private String model;
    private int ramSize;
    private int hddSize;
    private String os;
    private String color;
    private int price;

    public NoteBook(String brand, String model, int ramSize, int hddSize, String os, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getRamSize() {
        return ramSize;
    }
    
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    
    public int getHddSize() {
        return hddSize;
    }
    
    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }
    
    public String getOs() {
        return os;
    }
    
    public void setOs(String os) {
        this.os = os;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM size: " + ramSize + " GB");
        System.out.println("HDD size: " + hddSize + " GB");
        System.out.println("Operating System: " + os);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
    }
}
