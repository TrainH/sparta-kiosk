package remind;

import remind.be.Category;
import remind.be.DataBase;
import remind.be.Item;
import remind.fe.CartListPage;
import remind.fe.CategoryListPage;
import remind.fe.ItemListPage;
import remind.fe.dto.CartListPageCommand;
import remind.fe.dto.CategoryListPageCommand;
import remind.fe.dto.ItemListPageCommand;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        while(true) {
            List<Category> categoryList = DataBase.getCategoryList();

            CategoryListPageCommand categoryListPageCommand = CategoryListPage.display(categoryList);

            if (categoryListPageCommand.getCommand().equals("exit")){
                break;
            }

            if (categoryListPageCommand.getCommand().equals("retry")){
                continue;
            }
            if (categoryListPageCommand.getCommand().equals("item")){
                Category category = categoryListPageCommand.getCategory();

                ItemListPageCommand itemListPageCommand = ItemListPage.display(category);
                if (itemListPageCommand.getCommand().equals("add")){
                    DataBase.addCartList(itemListPageCommand.getItem());
                }
                if (itemListPageCommand.getCommand().equals("retry")) {
                    continue;
                }
            }

            if (categoryListPageCommand.getCommand().equals("cart")){
                List <Item> cartList = DataBase.getCartList();
                CartListPageCommand cartListPageCommand  = CartListPage.display(cartList);
                if (cartListPageCommand.getCommand().equals("exit")){
                    break;
                }
            }

        }
    }
}
