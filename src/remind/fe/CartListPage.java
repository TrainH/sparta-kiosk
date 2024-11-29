package remind.fe;

import remind.be.DataBase;
import remind.be.DiscountType;
import remind.be.Item;
import remind.fe.dto.CartListPageCommand;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CartListPage {
    public static CartListPageCommand display(List<Item> cartList){
        Scanner sc = new Scanner(System.in);

        System.out.println("[ Orders ]");
        cartList.stream().forEach(item -> System.out.println( item.getName() +" | W "+item.getPrice() + " | " + item.getDescription()));
        System.out.println();

        System.out.println("[ Total ]");
        double totalPrice = cartList.stream()
                .mapToDouble(Item::getPrice)
                .sum();
        System.out.println("W " + totalPrice);
        System.out.println();

        System.out.println("1. 주문       2. 메뉴판");
        String command = sc.nextLine();


        if (Objects.equals(command, "1")){
            System.out.println();
            System.out.println("할인 정보를 입력해주세요.");
            System.out.println("1. 국가유공자 : 10%");
            System.out.println("2. 군인      : 5%");
            System.out.println("3. 학생      : 3%");
            System.out.println("4. 일반      : 0%");

            double discountRate = DiscountType.fromCode(sc.nextLine()).getDiscountRate();

            System.out.println("주문이 완료되었습니다. 금액은 W " + totalPrice*(1-discountRate) + "입니다.");
            System.out.println();

            DataBase.removeCartList();

            System.out.println("0. 종료       1. 메뉴판으로 돌아가기");

            String command2 = sc.nextLine();
            if (Objects.equals(command2, "0")) {
                return new CartListPageCommand("exit", null);
            } else  {
                return new CartListPageCommand("retry", null);
            }
        } else {
            return new CartListPageCommand("retry", null);
        }
    }
}
