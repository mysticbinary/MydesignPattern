package BehavorialClass.StrategyPattern1;

public class Mouse implements USB {

    @Override
    public void read() {
        System.out.println("读取鼠标数据...");
    }
}