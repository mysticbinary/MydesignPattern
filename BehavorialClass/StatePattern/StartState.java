package BehavorialClass.StatePattern;

// 我们定义具体的状态类 StartState 和 StopState 实现 State 接口。
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
