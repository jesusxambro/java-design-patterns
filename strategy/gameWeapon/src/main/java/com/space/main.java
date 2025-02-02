package main.java.com.space;

public class main {

    public static void main(String[] args) {
        Weapon battleRifle = new BattleRifle();
        battleRifle.display();
        battleRifle.setFireAction(new AssaultRifleAction() );
        battleRifle.setReloadAction(new LowDragReload());
        battleRifle.fireWeapon();
        battleRifle.performReload();

    }

}
