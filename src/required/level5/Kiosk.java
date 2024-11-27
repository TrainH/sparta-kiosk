package required.level5;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *  요구사항 (1)`Kiosk` 클래스 생성하기
 *     - 설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
 *     -      `MenuItem`을 관리하는 리스트가 필드로 존재합니다.
 *     -      `main` 함수에서 관리하던 입력과 반복문 로직은 이제 `start` 함수를 만들어 관리합니다.
 *     -      `List<MenuItem> menuItems` 는 `Kiosk` 클래스 생성자를 통해 값을 할당합니다.
 *              -    `Kiosk` 객체를 생성하고 사용하는 `main` 함수에서 객체를 생성할 때 값을 넘겨줍니다.
 */

//  요구사항 (1) `Kiosk` 클래스 생성하기
public class Kiosk {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        String NUMBER_REG = "^[0-9]*$";
        while(true) {


            // (1) Main MENU
            System.out.println("[ MAIN MENU ]");
            List<String> menuCategories = menu.getMenuCategories();
            for (int i = 0; i < menuCategories.size(); i++) {
                System.out.println((i+1) + ". " + menuCategories.get(i));
            }
            System.out.println("0. 종료  | 종료");

            String firstInput = sc.nextLine();

            if (firstInput.equals("0")) {
                break; // 0이면 종료
            } else if (Pattern.matches(NUMBER_REG, firstInput)) {
                System.out.println(); // 숫자이면 넘어감
            } else{
                try {
                    throw new InputException("숫자를");
                } catch (InputException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            int number = Integer.parseInt(firstInput);
            String menuCategory = menuCategories.get(number-1);



            // (2) BURGERS MENU
            System.out.println("[ BURGERS MENU ]");
            List<MenuItem> burgerMenuItems = menu.getMenuItems(menuCategory);

            // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            for (int i = 0; i < burgerMenuItems.size(); i++) {
                MenuItem menuItem = burgerMenuItems.get(i);
                System.out.println((i + 1) + ". " + menuItem.getName() + "| W " + menuItem.getPrice() + " | " + menuItem.getDescription());
            }
            System.out.println("0. 뒤로가기");

            String SecondInput = sc.nextLine();

            // 입력한 값에 대한 예외처리
            if (SecondInput.equals("0")) {
                continue; // 0이면 뒤로가기
            } else if (Pattern.matches(NUMBER_REG, firstInput)) {
                System.out.println(); // 숫자이면 넘어감
            } else{
                try {
                    throw new InputException("숫자를"); // 숫자아니면 예외
                } catch (InputException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            int number2 = Integer.parseInt(SecondInput);
            MenuItem selectedItem = burgerMenuItems.get(number2-1);

            System.out.println("선택한 메뉴: " + selectedItem.getName() + "| W " + selectedItem.getPrice() + " | " + selectedItem.getDescription());
            System.out.println();

        }; // 입력된 값이 "0"이 아니면 계속 실행하고 0이면 종료
        System.out.println("프로그램을 종료합니다. ");
    }
}
