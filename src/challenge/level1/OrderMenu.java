package challenge.level1;


import java.util.Scanner;
import java.util.regex.Pattern;

public class OrderMenu {
    public static String start(String order) throws InputException{
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        MenuItem menuItem = menu.getMenuItem(order);
        String NUMBER_REG = "^[0-9]*$";
        System.out.println( "[" + menuItem.getName() + "| W " + menuItem.getPrice() + " | " + menuItem.getDescription() + "]");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인       2. 취소");
        String ThirdInput = sc.nextLine();

        if (!Pattern.matches(NUMBER_REG, ThirdInput)) {
            throw new InputException("숫자를");
        }

        if (ThirdInput.equals("1")){
            return order;
        } else if (ThirdInput.equals("2")){
            return "2";
        } else {
            throw new InputException("1 또는 2를");
        }
    }
}
