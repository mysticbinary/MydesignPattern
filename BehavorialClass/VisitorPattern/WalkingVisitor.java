package BehavorialClass.VisitorPattern;

public class WalkingVisitor implements AnimalVisitor {
    @Override
    public void visitDog(Dog dog) {
        System.out.println("Walking dog: Take it for a walk in the park.");
    }

    @Override
    public void visitCat(Cat cat) {
        System.out.println("Walking cat: Let it roam in the backyard.");
    }

    @Override
    public void visitBird(Bird bird) {
        System.out.println("Walking bird: Let it fly around in a safe area.");
    }
}
