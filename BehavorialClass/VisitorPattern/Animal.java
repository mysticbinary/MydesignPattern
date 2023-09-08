package BehavorialClass.VisitorPattern;

public interface Animal {
    void accept(AnimalVisitor visitor);
}

