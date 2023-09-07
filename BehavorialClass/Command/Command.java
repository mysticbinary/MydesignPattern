package BehavorialClass.Command;

interface Command {
    void execute();

    void undo();
}


class TvOnCommand implements Command {
    private Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("发送请求:请打开电视");
        tv.on();
    }

    @Override
    public void undo() {
        System.out.println("发送请求:撤销打开电视");
        tv.off();
    }
}

class TvOffCommand implements Command {
    private Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println("发送请求:请关闭电视");
        tv.off();
    }

    @Override
    public void undo() {
        System.out.println("发送请求:撤销关闭电视");
        tv.on();
    }
}

class Tv {
    private boolean isOn = false;

    public void on() {
        isOn = true;
        System.out.println("---------------------");
        System.out.println("电视已开启 - " + isOn);
        System.out.println("---------------------");
    }

    public void off() {
        isOn = false;
        System.out.println("---------------------");
        System.out.println("电视已关闭 - " + isOn);
        System.out.println("---------------------");
    }

    public boolean getStatus() {
        return isOn;
    }
}

