package main.java.com.duck;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("¯\\_(ツ)_/¯");
    }
}
