package Strategy.practice;

import Strategy.Ax;
import Strategy.GameCharacter;
import Strategy.Knife;
import Strategy.Sword;

public class Main {
    public static void main(String[] args) {
        /*Ainterface ainterface = new AinterfaceImpl();

        ainterface.funcA();

        AObject aObject = new AObject();
        aObject.funcAA();*/
        GameCharacter character = new GameCharacter();
        character.attack();
        character.setWeapon(new Knife());
        character.attack();
        character.setWeapon(new Sword());
        character.attack();
        character.setWeapon(new Ax());
        character.attack();
    }
}
