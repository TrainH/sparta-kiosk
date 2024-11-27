package required.level4;
import java.util.List;
import java.util.Arrays;
/**
 * <h2>Menu 클래스 생성하기</h2>
        * <ol>
 *     <li> 설명 : MenuItem 클래스를 관리하는 클래스입니다.
        *              예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함</li>
        *     <li> List<MenuItem> 은 Kiosk 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경 </li>
        *     <li> 여러 버거들을 포함하는 상위 개념 ‘버거’ 같은 카테고리 이름 필드를 갖음</li>
        *     <li> 메뉴 카테고리 이름을 반환하는 메서드가 구현되어야 </li>
        * </ol>
 */


// 1. 설명 : MenuItem 클래스를 관리하는 클래스입니다.
//          예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함
public class Menu {

    // 2. List<MenuItem> 은 Kiosk 클래스가 관리하기에 적절하지 않으므로 Menu 클래스가 관리하도록 변경
    private final List<MenuItem> menuItems = Arrays.asList(
            new MenuItem("Burgers","ShackBurger  ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
            new MenuItem("Burgers","SmokeShack   ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
            new MenuItem("Burgers","Cheeseburger ", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
            new MenuItem("Burgers","Hamburger    ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
    );

    // 3. 여러 버거들을 포함하는 상위 개념 ‘버거’ 같은 카테고리 이름 필드를 갖음
    private final List<String> menuCategories = Arrays.asList(
            "Burgers",
            "Drinks",
            "Desserts"
    );

    public Menu(){
    }

    // 4. 메뉴 카테고리 이름을 반환하는 메서드가 구현되어야
    public List<String> getMenuCategories() {
        return this.menuCategories;
    }

    public List <MenuItem> getMenuItems(String category){
        return this.menuItems.stream().filter(menuItem -> menuItem.getCategory().contains(category)).toList();
    }


}
