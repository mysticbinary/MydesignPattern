package BehavorialClass.VisitorPattern;

public interface AnimalVisitor {
    void visitDog(Dog dog);
    void visitCat(Cat cat);
    void visitBird(Bird bird);
}
