package required.level4;
//`MenuItem` 클래스 생성하기
//    - 설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다.
//    - 클래스는 `이름`, `가격`, `설명` 필드를 갖습니다.

public class MenuItem {
    private String category;
    private String name; // 이름
    private double price; // 가격
    private String description; // 설명

    public MenuItem(String category, String name, double price, String description) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // (1) Getter
    public String getCategory() {return this.category;}
    public String getName() {return this.name;}
    public double getPrice() {return this.price;}
    public String getDescription() {return this.description;}

    // (2) Setter
    public void setCategory(String category) {this.category = category;}
    public void setName(String name) {this.name = name;}
    public void setPrice(double price) {this.price = price;}
    public void setDescription(String description) {this.description = description;}
}
