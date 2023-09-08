package BehavorialClass.VisitorPattern;

public class Bird implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitBird(this);
    }
}
