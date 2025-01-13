package main.java.com.duck;


public class Main {
    public static void main(String[] args) {
        Duck sadDuck = new SadDuck();
        sadDuck.performFly();
        sadDuck.setFlyBehavior(new FlyRocket());
        sadDuck.performFly();

    }
}