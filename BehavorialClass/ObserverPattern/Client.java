package BehavorialClass.ObserverPattern;

public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.setState("Hello World!");
        // 输出：Observer 1 received message: Hello World!
        //      Observer 2 received message: Hello World!


    }

}
