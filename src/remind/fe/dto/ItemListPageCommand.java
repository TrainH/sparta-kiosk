package remind.fe.dto;

import remind.be.Item;

public class ItemListPageCommand {
    private String command;
    private Item item;

    public ItemListPageCommand(String command, Item item) {
        this.command = command;
        this.item = item;
    }
    public String getCommand() {
        return command;
    }
    public Item getItem() {
        return item;
    }
}
