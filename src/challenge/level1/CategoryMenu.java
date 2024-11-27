package challenge.level1;

import java.util.Scanner;
import java.util.List;
import java.util.regex.Pattern;

public class CategoryMenu {
    public static String start(String category) throws InputException{
        // (2) CategoryM(BURGERS) MENU
        Menu menu = new Menu();
        String NUMBER_REG = "^[0-9]*$";
        System.out.println("[ "+category+" MENU ]");

        List<MenuItem> menuItems = menu.getMenuItems(category);

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menuItem = menuItems.get(i);
            System.out.println((i + 1) + ". " + menuItem.getName() + "| W " + menuItem.getPrice() + " | " + menuItem.getDescription());
        }

        System.out.println("0. 뒤로가기");

        Scanner sc = new Scanner(System.in);
        String SecondInput = sc.nextLine();

        // 입력한 값에 대한 예외처리

        if (!Pattern.matches(NUMBER_REG, SecondInput)) {
            throw new InputException("숫자를");
        }
        if (SecondInput.equals("0")){
            return SecondInput;
        } else {
            int number2 = Integer.parseInt(SecondInput);

            MenuItem selectedItem = menuItems.get(number2 - 1);

            System.out.println("선택한 메뉴: " + selectedItem.getName() + "| W " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
            System.out.println();

            return selectedItem.getName();
        }
    }
}
