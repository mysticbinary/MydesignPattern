package BehavorialClass.MediatorPattern;

// 抽象中介者
interface Mediator {
    void sendMessage(String message, Colleague colleague);
}
