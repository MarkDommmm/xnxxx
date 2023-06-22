package Model;

public class Brand {
    private int Id;
    private String brandName;

    public Brand() {
    }

    public Brand(int id, String brandName) {
        Id = id;
        this.brandName = brandName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Model.Brand{" +
                "Id=" + Id +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
