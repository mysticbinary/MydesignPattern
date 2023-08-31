package creationalClass.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Branch implements Myfile {
    private String name;
    private List<Myfile> components;

    public Branch(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(Myfile component) {
        components.add(component);
    }

    public void removeComponent(Myfile component) {
        components.remove(component);
    }

    public void showInfo() {
        System.out.println("Folder: " + name);
        for (Myfile component : components) {
            component.showInfo();
        }
    }
}
