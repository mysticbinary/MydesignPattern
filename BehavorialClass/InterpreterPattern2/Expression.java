package BehavorialClass.InterpreterPattern2;

import java.util.HashSet;
import java.util.Set;

//抽象表达式类
interface Expression {
    public boolean interpret(String info);
}

//终结符表达式类
class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<String>();

    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) set.add(data[i]);
    }

    public boolean interpret(String info) {
        if (set.contains(info))
            return true;
        return false;
    }
}

//非终结符表达式类
class AndExpression implements Expression {
    private Expression city = null;
    private Expression person = null;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    public boolean interpret(String info) {
        String s[] = info.split("的");
        System.out.println(city.interpret(s[0]) && person.interpret(s[1]));
        return city.interpret(s[0]) && person.interpret(s[1]);
    }
}