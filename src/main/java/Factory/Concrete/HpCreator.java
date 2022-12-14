package Factory.Concrete;

import Factory.Framework.Item;
import Factory.Framework.ItemCreator;

import javax.xml.crypto.Data;
import java.util.Date;

public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터 베이스에서 체력 회복 물약의 정보를 가져온다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력 회복 물약을 새로 생성"+new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
