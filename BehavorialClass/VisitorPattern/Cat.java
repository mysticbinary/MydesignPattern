package BehavorialClass.VisitorPattern;

public class Cat implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitCat(this);
    }
}
