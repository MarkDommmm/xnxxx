package Model;

public class category {
    private int Id;
    private String categoryName;

    public category() {
    }

    public category(int id, String categoryName) {
        Id = id;
        this.categoryName = categoryName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Model.category{" +
                "Id=" + Id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
