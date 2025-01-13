package main.java.com.duck;

public class FlyRocket implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println(".--\"\"--.\n" +
                ".'          . / O O \\ | \\ ^^ / | \\-----'   /\n" +
                "`._______.'\n" +
                "||| |||\n" +
                "||| |||\n" +
                "||| |||\n" +
                "||| |||");
    }
}
