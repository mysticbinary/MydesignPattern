package BehavorialClass.StrategyPattern;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new AddStrategy());
        int result1 = context.executeStrategy(10, 5);
        System.out.println("10 + 5 = " + result1);

        context = new Context(new SubtractStrategy());
        int result2 = context.executeStrategy(10, 5);
        System.out.println("10 - 5 = " + result2);
    }

}
