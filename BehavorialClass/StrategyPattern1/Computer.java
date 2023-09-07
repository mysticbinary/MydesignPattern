package BehavorialClass.StrategyPattern1;

public class Computer {

    private USB usb;

    public void setUSB(USB usb){
        this.usb = usb;
    }

    public void execute(){
        usb.read();
    }
}
