package BehavorialClass.StrategyPattern1;

public class KeyBoard implements USB{

    @Override
    public void read() {
        System.out.println("读取键盘数据...");
    }
}

