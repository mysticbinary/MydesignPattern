package BehavorialClass.StrategyPattern1;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.setUSB(new KeyBoard());
        computer.execute();

        computer.setUSB(new Mouse());
        computer.execute();
    }
}
