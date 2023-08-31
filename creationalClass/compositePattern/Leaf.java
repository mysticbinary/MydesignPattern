package creationalClass.compositePattern;

public class Leaf implements Myfile {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Leaf: " + name);
    }
}


