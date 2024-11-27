package challenge.level2;

import java.util.List;
import java.util.Scanner;
public class Kiosk {
    public static void start() {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        List<MenuItem> carts;
        while(true) {

            try {
                carts = menu.getCart();
                boolean isOrder = !carts.isEmpty();
                String firstInput = MainMenu.start(isOrder);
                System.out.println();

                if (firstInput.equals("0")) {
                    break;
                } else if (firstInput.equals("5")) {
                    continue;
                }

                if (firstInput.equals("4")) {
                    System.out.println("아래와 같이 주문 하시겠습니까?");

                    System.out.println("[ Orders ]");
                    carts.stream().forEach(cart -> System.out.println(cart.getName() + "| W "  + cart.getPrice() + " | " + cart.getDescription()));
                    System.out.println();
                    System.out.println("[ Total ]");
                    System.out.println("W " + menu.getTotalPrice());

                    System.out.println();
                    System.out.println("1. 주문    2. 메뉴판");
                    String fourthInput = sc.nextLine();

                    if (fourthInput.equals("1")){

                        System.out.println();
                        System.out.println("할인 정보를 입력해주세요.");
                        System.out.println("1. 국가유공자 : 10%");
                        System.out.println("2. 군인      : 5%");
                        System.out.println("3. 학생      : 3%");
                        System.out.println("4. 일반      : 0%");
                        String fifthInput = sc.nextLine();
                        double discountRate = UserType.fromCode(fifthInput).getDiscountRate();
                        System.out.println();
                        System.out.println("주문이 완료되었습니다. 금액은 W " +((1 - discountRate)*menu.getTotalPrice()) + " 입니다.");
                        menu.removeCart(); // 주문 완료이후에 장바구니 제거
                        break;
                    } else if (fourthInput.equals("2")){
                        continue;
                    } else{
                        System.out.println("잘못된 번호입니다. ");
                        continue;
                    }
                }

                String secondInput = CategoryMenu.start(firstInput);

                if (secondInput.equals("0")) {
                    continue;
                }

                String thirdInput = OrderMenu.start(secondInput);
                System.out.println();

                if (thirdInput.equals("2")) {
                    continue;
                }

                MenuItem menuItem = menu.getMenuItem(thirdInput);
                menu.addCart(menuItem);


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("프로그램을 종료합니다. ");
        };
}
