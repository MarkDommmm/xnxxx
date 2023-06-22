package Model;

public class Product {
    private  int Id;
    private  String name;
    private int price;
    private  int quantity;
    private  String brand;
    private String color;
    private String category;

    public Product() {
    }

    public Product(int id, String name, int price, int quantity, String brand, String color, String category) {
        Id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.color = color;
        this.category = category;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Model.Product{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", Model.category='" + category + '\'' +
                '}';
    }
}
