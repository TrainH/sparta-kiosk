package remind.fe;

import remind.be.Category;
import remind.be.DataBase;
import remind.fe.dto.CategoryListPageCommand;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class CategoryListPage {
    public static CategoryListPageCommand display(List<Category> categoryList){

        Scanner sc = new Scanner(System.in);

        System.out.println("[ MAIN MENU ]");

        AtomicInteger counter = new AtomicInteger(1);

        categoryList.stream()
                .forEach(category->System.out.println((counter.getAndIncrement()) + ". "+ category.getName()));
        System.out.println("0. 종료");

        if (!DataBase.getCartList().isEmpty()){
            System.out.println("[ Orders ]");
            System.out.println("4. Orders");
            System.out.println("5. Cancel");
        }

        int command= sc.nextInt();


        if (command == 0) {
            return new CategoryListPageCommand("exit", null);

        } else if (command == 4) {
            return new CategoryListPageCommand("cart", null);
        } else if (command == 5) {
            return new CategoryListPageCommand("retry", null);

        } else if (0<  command && command <= categoryList.size()) {
            Category selectedCategory = categoryList.get(command - 1);
            System.out.println(">> 선택된 음식종류: " + selectedCategory.getName());
            System.out.println();
            return new CategoryListPageCommand("item", selectedCategory);
        } else {
            System.out.println("잘못된 번호를 입력하셨습니다.");
            System.out.println();
            return new CategoryListPageCommand("retry", null);
        }
    }
}
