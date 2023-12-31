package StructureClass.compositePattern2;

import java.util.ArrayList;
import java.util.List;

public class Branch implements Counter {
    private List<Counter> counterList = new ArrayList<>();

    public void add(Counter counter) {
        counterList.add(counter);
    }

    public void delete(Counter counter) {
        counterList.remove(counter);
    }

    public List<Counter> getChild() {
        return counterList;
    }

    @Override
    public int count() {
        int sum = 0;
        for (Counter counter : counterList) {
            sum += counter.count();
        }
        return sum;
    }
}
