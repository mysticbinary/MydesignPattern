package BehavorialClass.MementoPattern;

import java.util.ArrayList;
import java.util.List;

// 创建备忘录类
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// 创建源对象类
class Originator {
    private List<Memento> savedMementos = new ArrayList<>();
    private String state;
    public void setState(String state) {
        this.state = state;
    }


    public String getState() {
        return state;
    }
    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }


    public Memento createMemento() {
        Memento memento = new Memento(state);
        savedMementos.add(memento);
        return memento;
    }
}

// 创建接收者类，备忘录的创建者和使用者
class Caretaker {
    private Memento memento;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}

