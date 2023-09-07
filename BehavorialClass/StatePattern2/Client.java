package BehavorialClass.StatePattern2;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new IdleState());  //初始化状态为 Idle
        context.request("《三国》");  // "当前状态为 Idle"

        context.setState(new BusyState());  // 改变状态为 Busy
        context.request("《春秋》");  // "当前状态为 Busy"
    }
}
