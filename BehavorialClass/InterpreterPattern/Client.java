package BehavorialClass.InterpreterPattern;

public class Client {

    public static void main(String[] args) {
        Expression expression1 = new TerminalExpression("Hello");
        Expression expression2 = new TerminalExpression("World");
        Expression expression3 = new NonterminalExpression(expression1, expression2);

        System.out.println(expression1.interpret("Hello")); // true
        System.out.println(expression1.interpret("Hi")); // false

        System.out.println(expression2.interpret("World")); // true
        System.out.println(expression2.interpret("Goodbye")); // false

        System.out.println(expression3.interpret("Hello World")); // true
        System.out.println(expression3.interpret("Hi World")); // false
    }

}
