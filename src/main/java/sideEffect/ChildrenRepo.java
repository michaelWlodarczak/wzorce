package sideEffect;

import java.util.ArrayList;
import java.util.List;

public class ChildrenRepo {

    private List<Child> children = new ArrayList<>();

    public void addChildren(Child child) {
        child.setSurname("no surname");
        children.add(child);
    }

    @Override
    public String toString() {
        return children.toString();
    }
}
