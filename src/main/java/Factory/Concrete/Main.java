package Factory.Concrete;

import Factory.Framework.Item;
import Factory.Framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        creator.create();
        item.use();
    }
}
