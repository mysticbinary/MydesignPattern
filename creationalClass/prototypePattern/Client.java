package creationalClass.prototypePattern;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        Shape clonedRectangle = (Shape) rectangle.clone();
        Shape clonedCircle = (Shape) circle.clone();

        System.out.println("Original Rectangle Type: " + rectangle.type);
        rectangle.draw(); // Drawing a rectangle.
        System.out.println("Cloned Rectangle Type: " + clonedRectangle.type);
        clonedRectangle.draw(); // Drawing a rectangle.

        System.out.println("- origin obj info:");
        System.out.println("Original Circle Type: " + circle.type);
        System.out.println("Original Circle Size: " + circle.size);
        System.out.println("Original Circle Couple_obj color: " + circle.couple.getColor());
        System.out.println("Original Circle Couple_obj light: " + circle.couple.getLight());
        circle.draw(); // Drawing a circle.

        System.out.println("对克隆的对象进行新赋值:");
        clonedCircle.setType("My is ClonedCircle");
        clonedCircle.setSize(22);
        clonedCircle.setCouple("yellow", 33);
        System.out.println("Cloned Circle Type: " + clonedCircle.type);
        System.out.println("Cloned Circle Size: " + clonedCircle.size);
        System.out.println("Original Circle Couple_obj color: " + clonedCircle.couple.getColor());
        System.out.println("Original Circle Couple_obj light: " + clonedCircle.couple.getLight());


        System.out.println("- origin Obj info:");
        System.out.println("Original Circle Type: " + circle.type);
        System.out.println("Original Circle Size: " + circle.size);
        System.out.println("Original Circle Couple_obj color: " + circle.couple.getColor());
        System.out.println("Original Circle Couple_obj light: " + circle.couple.getLight());
        circle.draw(); // Drawing a circle.
    }
}
