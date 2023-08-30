package creationalClass.prototypePattern;

// 具体原型类 - Rectangle
class Rectangle extends Shape {
    public Rectangle() {
        this.type = "Rectangle";
        this.size = 1;
    }

    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    @Override
    void setType(String type) {
        this.type = type;
    }

    void setSize(int size) {
        this.size = size;
    }

    void setCouple(String color, int light) {
        this.couple.setLight(light);
        this.couple.setColor(color);
    }
}
