package StructureClass.compositePattern2;

public class Leaf implements Counter {
    private int sum = 0;

    public Leaf(int sum) {
        this.sum = sum;
    }

    @Override
    public int count() {
        return sum;
    }
}


