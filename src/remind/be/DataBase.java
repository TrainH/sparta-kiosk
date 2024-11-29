package remind.be;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {

    private static String dbName = "kiosk";

    private static List<Item> burgerList = new ArrayList<>(List.of(
            new Item("ShakeBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
            new Item("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
            new Item("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
            new Item("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
    ));

    private static List<Item> pizzaList = new ArrayList<>(List.of(
            new Item("하와이안 피자", 15.9, "화와이에서 공수해온, 파인애플과 피자가 어우러진 피자"),
            new Item("콤비네이션 피자", 12.9, "여러가지 야채와 고기가 어우려진, 한대모아 콤비네이션 피자"),
            new Item("치즈 피자", 10.9, "오직 치즈로만 이루어진, 치즈가 토핑된 치즈피자"),
            new Item("까르보나라 피자", 25.4, "크림파스타와 피자가 만나서, 까르보나라 피자")
    ));


    private static List<Category> categoryList = Arrays.asList(
            new Category("Burger", burgerList),
            new Category("Pizza", pizzaList)
    );

    private static List<Item> cartList = new ArrayList<>();

    private static List<Item> orderList = new ArrayList<>();

    public DataBase() {}

    public static String getName(){
        return dbName;
    }

    public static List<Category> getCategoryList(){
        return categoryList;
    }

    public static List<Item> getCartList(){
        return cartList;
    }

    public static void addCartList(Item item){
        cartList.add(item);
        System.out.println(item.getName() + "이 장바구니에 추가되었습니다.");
        System.out.println();
    }

    public static void removeCartList(){
        cartList = new ArrayList<>();
    }

    public static List<Item> getOrderList(){
        return orderList;
    }

    public static void addOrderList(Item item){
        orderList.add(item);
    }

    public static void removeOrderList(Item item){
        orderList.remove(item);
    }
}
