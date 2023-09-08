package BehavorialClass.VisitorPattern;

public class FeedingVisitor implements AnimalVisitor {
    @Override
    public void visitDog(Dog dog) {
        System.out.println("Feeding dog: Give it some dog food.");
    }

    @Override
    public void visitCat(Cat cat) {
        System.out.println("Feeding cat: Give it some cat food.");
    }

    @Override
    public void visitBird(Bird bird) {
        System.out.println("Feeding bird: Give it some bird food.");
    }
}
