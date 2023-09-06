package BehavorialClass.MediatorPattern;

// 客户端代码
public class Client {
    public static void main(String[] args) {
        // 创建中介者
        ConcreteMediator mediator = new ConcreteMediator();

        // 创建具体同事类
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        // 设置中介者的同事对象
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        // 同事类之间进行通信
        colleague1.sendMessage("Hello from Colleague1");
        colleague2.sendMessage("Hi from Colleague2");
    }
}