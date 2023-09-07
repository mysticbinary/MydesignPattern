package BehavorialClass.StatePattern2;

// 定义状态接口
interface State {
    void handle(String bookName);
}

class IdleState implements State {
    @Override
    public void handle(String bookName) {
        System.out.println("当前状态为 Idle ，有空去读书：" + bookName);
    }
}
class BusyState implements State {
    @Override
    public void handle(String bookName) {
        System.out.println("当前状态为 Busy, 没空去读取：" + bookName);
    }
}


// 定义一个Context类，它使用状态对象来控制自身的状态
class Context {
    private State state;
    public Context(State state) {
        this.state = state;
    }
    public void request(String bookName) {
        state.handle(bookName);
    }
    public void setState(State state) {
        this.state = state;
    }
}
