package main.java.com.duck;

public class Leg implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly. (⌐■_■)...");
    }
}
