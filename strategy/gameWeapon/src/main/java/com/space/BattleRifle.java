package main.java.com.space;

public class BattleRifle extends Weapon {
    public BattleRifle(){
        this.fireAction = new SixFive();
        this.reloadAction = new HandReload();
    }

    @Override
    public void display() {
        System.out.println(".....");
    }

}
