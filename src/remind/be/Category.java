package remind.be;

import java.util.List;

public class Category {
    private String name;
    private List<Item> category;

    public Category(String name, List<Item> category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public List<Item> getCategory() {
        return this.category;
    }
}