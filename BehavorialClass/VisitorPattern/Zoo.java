package BehavorialClass.VisitorPattern;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Bird() };

        AnimalVisitor feedingVisitor = new FeedingVisitor();
        AnimalVisitor walkingVisitor = new WalkingVisitor();

        for (Animal animal : animals) {
            animal.accept(feedingVisitor);
            animal.accept(walkingVisitor);
        }
    }
}