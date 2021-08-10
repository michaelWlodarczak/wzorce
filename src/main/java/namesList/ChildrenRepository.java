package namesList;

import java.awt.*;
import java.util.List;

public interface ChildrenRepository {

    boolean addToList(String name);

    List<String> getChildren();

    void sortChildren();

    void removeDuplicates();

    void namesToUpperCase();

    void namesToLowerCase();


}
