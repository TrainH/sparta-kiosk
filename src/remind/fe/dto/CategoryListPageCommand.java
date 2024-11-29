package remind.fe.dto;

import remind.be.Category;

public class CategoryListPageCommand {
    private String command;
    private Category category;

    public CategoryListPageCommand(String command, Category category) {
        this.command = command;
        this.category = category;
    }
    public String getCommand() {
        return command;
    }
    public Category getCategory() {
        return category;
    }
}
