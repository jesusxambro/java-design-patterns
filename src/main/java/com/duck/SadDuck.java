package main.java.com.duck;

public class SadDuck extends Duck{
    public SadDuck(){
        this.flyBehavior = new Leg();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("(T＿T)");
    }
}
