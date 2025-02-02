package main.java.com.space;

public abstract class Weapon {
    ReloadAction reloadAction;
    FireAction fireAction;

    public Weapon() {

    }

    public abstract void display();

    public void performReload() {
        reloadAction.reload();
    }

    public void fireWeapon() {
        fireAction.fire();
    }

    public void setReloadAction(ReloadAction rA) {
        this.reloadAction = rA;
    }

    public void setFireAction(FireAction fA) {
        this.fireAction = fA;
    }

}
