package challenge.level1;

public class MenuItem {
    // (1) 속성
    private String category;
    private String name;
    private double price;
    private String description;

    // (2) 생성자
    public MenuItem(String category, String name, double price, String description) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.description = description;
    }


    // (3) 기능(각 필드의 getter, setter)
    public String getCategory() {return this.category;};
    public void setCategory(String category) {this.category = category;}

    public String getName() {return this.name;};
    public void setName(String name) {this.name = name;}

    public double getPrice() {return this.price;};
    public void setPrice(int price) {this.price = price;}

    public String getDescription() {return this.description;};
    public void setDescription(String description) {this.description = description;}

}
