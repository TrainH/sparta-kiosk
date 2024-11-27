package challenge.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems = Arrays.asList(
            new MenuItem("Burgers" , "ShackBurger ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
            new MenuItem("Burgers" , "SmokeShack  ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
            new MenuItem("Burgers" , "Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
            new MenuItem("Burgers" , "Hamburger   ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
    );


    private List<String> categories = Arrays.asList(
            "Burgers",
            "Drinks",
            "Desserts"
    );

    private List<MenuItem> cartItems = new ArrayList<>();


    public Menu(){}


    public List<String> getCategories() {
        return this.categories;
    }


    public List <MenuItem> getMenuItems(String category){
//        return this.menuItems;
        return this.menuItems.stream()
                .filter(menuItem -> menuItem.getCategory().equals(category))
                .toList();
    }

    public MenuItem getMenuItem(String name){
        return this.menuItems.stream()
                .filter(menuItem -> menuItem.getName().equals(name))
                .toList().get(0);

    }

    public void addCart(MenuItem menuItem){
        this.cartItems.add(new MenuItem(menuItem.getCategory(),
                                            menuItem.getName(),
                                            menuItem.getPrice(),
                                            menuItem.getDescription()));
    }

    public List<MenuItem> getCart(){
        return this.cartItems;
    }

    public void removeCart(){
        this.cartItems = new ArrayList<>();
    }

    public double getTotalPrice(){
        return this.cartItems.stream()
                    .mapToDouble(MenuItem::getPrice)
                    .sum();
    }
}
