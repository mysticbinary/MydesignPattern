package BehavorialClass.MementoPattern;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("原始状态");
        System.out.println("原始状态：" + originator.getState());
        //
        Caretaker caretaker = new Caretaker(originator.createMemento());
        originator.setState("修改后的状态");
        System.out.println("修改后的状态：" + originator.getState());
        //
        originator.setMemento(caretaker.getMemento());
        System.out.println("恢复后的状态：" + originator.getState());
    }
}
