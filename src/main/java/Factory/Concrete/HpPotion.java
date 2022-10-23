package Factory.Concrete;

import Factory.Framework.Item;

public class HpPotion implements Item {

    @Override
    public void use() {
        System.out.println("체력 회복");
    }
}
