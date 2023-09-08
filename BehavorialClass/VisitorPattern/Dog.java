package BehavorialClass.VisitorPattern;

public class Dog implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitDog(this);
    }
}
