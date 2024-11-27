package challenge.level1;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainMenu {
    public static String start(boolean isOrder) throws InputException {
            // Scanner 선언
            Scanner sc = new Scanner(System.in);


            // (1) Main MENU
            String NUMBER_REG = "^[0-9]*$";
            Menu menu = new Menu();

            List<String> menuCategories = menu.getCategories();

            System.out.println("[ MAIN MENU ]");

            for (int i = 0; i < menuCategories.size(); i++) {
                System.out.println((i + 1) + ". " + menuCategories.get(i));
            }
            System.out.println("0. 종료  | 종료");

            if (isOrder) {
                System.out.println();
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. Orders");
                System.out.println("5. Cancel");
            }

            String firstInput = sc.nextLine();

            // 입력한 값에 대한 예외처리

            if (!Pattern.matches(NUMBER_REG, firstInput)) {
                throw new InputException("숫자를");
            }

            if (firstInput.equals("0")| firstInput.equals("4") | firstInput.equals("5")) {
                return firstInput;
            }  else {
                int number = Integer.parseInt(firstInput);
                return menuCategories.get(number-1);
            }
    }
}
