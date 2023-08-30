package creationalClass.prototypePattern;

// 具体原型类 - Circle
class Circle extends Shape {

    public Circle() {
        this.type = "Circle";
        this.size = 1;

        this.couple = new Couple("red",2);
    }

    public void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    void setType(String type) {
        this.type = type;
    }

    @Override
    void setSize(int size) {
        this.size = size;
    }

    @Override
    void setCouple(String color, int light) {
        this.couple.setLight(light);
        this.couple.setColor(color);
    }

}


