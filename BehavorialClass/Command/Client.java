package BehavorialClass.Command;

public class Client {
    public static void main(String[] args) {
        Tv tv = new Tv();  // 创建一个电视对象
        Command command1 = new TvOnCommand(tv);  // 创建一个打开电视的命令对象
        Command command2 = new TvOffCommand(tv);  // 创建一个关闭电视的命令对象
        command1.execute();  // 执行打开电视的命令，电视状态为 on
        command2.execute();  // 执行关闭电视的命令，电视状态为 off
        command2.undo();  // 撤销关闭电视的命令，电视状态回到 on
        command1.undo();  // 撤销打开电视的命令，电视状态回到 off
    }
}
