package remind.fe;

import remind.be.Category;
import remind.be.Item;
import remind.fe.dto.ItemListPageCommand;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ItemListPage {
    public static ItemListPageCommand display(Category category){
        Scanner sc = new Scanner(System.in);

        // 아이템 리스트 디스플래이
        System.out.println("[ "+category.getName()+" MENU ]");

        List<Item> itemList = category.getCategory();
        AtomicInteger counter = new AtomicInteger(1);

        itemList.stream()
                .forEach(item->System.out.println((counter.getAndIncrement()) + ". "+ item.getName()+" | W "+item.getPrice() + " | " + item.getDescription()));
        System.out.println("0. 뒤로가기");

        // 아이템 리스트에서 번호 입력
        int command= sc.nextInt();


        if (command == 0) {
            return new ItemListPageCommand("retry", null);

        }else if (0<  command && command <= itemList.size()) {
            Item selectedItem = itemList.get(command - 1);
            System.out.println(">> 선택한 음식: " + selectedItem.getName() +" | W "+selectedItem.getPrice() + " | " + selectedItem.getDescription());
            System.out.println();
            // 1. 장바구니 안내 출력
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니가?");
            System.out.println("1. 확인        2. 취소");
            System.out.print("선택: ");

            // 2. 사용자 입력 값 처리
            int input = sc.nextInt();
            System.out.println();
            if (input == 1) {
                return new ItemListPageCommand("add", selectedItem);
            } else if (input == 2) {
                return new ItemListPageCommand("retry", null);
            } else {
                System.out.println("잘 못 선택 되었습니다. 다시 입력해주세요.");
                return new ItemListPageCommand("retry", null);
            }

        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.");
            return new ItemListPageCommand("retry", null);
        }
    }
}
