package required.level2;

// <요구사항1,2>
//`MenuItem` 클래스 생성하기
//    - 설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다.
//    - 클래스는 `이름`, `가격`, `설명` 필드를 갖습니다.

public class MenuItem {
    // `이름`, `가격`, `설명` 필드를 갖음
    private final String name; // 이름
    private final double price; // 가격
    private final String description; // 설명

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // (1) Getter
    public String getName() {return this.name;}
    public double getPrice() {return this.price;}
    public String getDescription() {return this.description;}
}
