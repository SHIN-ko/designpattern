package Strategy;

public class GameCharacter {
    private Weapon weapon;

    //change
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if(weapon == null) {
            System.out.println("Hand Attack");
        } else {
            //delegate
            weapon.attack();
        }
    }
}
