package creationalClass.prototypePattern;

public class Couple {
    private String color;
    private int light;

    public Couple(String color, int light) {
        this.color = color;
        this.light = light;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLight() {
        return light;
    }

    public void setLight(int light) {
        this.light = light;
    }
}
