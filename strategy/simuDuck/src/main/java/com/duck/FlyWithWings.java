package main.java.com.duck;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm airborne!");
    }
}
