package childrenRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ChildrenRepositoryBasic implements IChildrenRepository {

    private List<String> children = new ArrayList<>();

    @Override
    public boolean addChild(String child) {
        if (isValid(child)) {
            return children.add(child.trim() + ChildNumberGeneratorSingleton.getInstance().getNumber());  //trim usowa znaki biala na stringu, ale tylko na poczatku i koncu
        } else {                                       // dodalismy singleton
            //TODO wywolanie i zalogowanie ze uzytkownik podal bledne dane
            //getInstanece.wywolanie metody logujcej, ktora zapisze do listy zdarzenie
            return false;
        }
    }

    @Override
    public String getChildren() {
        //TODO logujemy ze ktos odczytal liste
        //zalogowali
        return children.toString();
    }


    @Override
    public void sortChildren() {
        Collections.sort(children);
        //TODO logujemy, ze uzytkownik posortowal liste
//        children = children.stream().sorted().collect(Collectors.toList());
//        children.sort((s1, s2) -> s1.compareTo(s2));
//        children.sort(String::compareTo);
    }

    @Override
    public void removeDuplicates() {
//        children = new ArrayList<>(new HashSet<>(children));
        children = children.stream().distinct().collect(Collectors.toList());
    }

    @Override
    public void setNamesToUpperCase() {
        children = children.stream().map(child -> child.toUpperCase()).collect(Collectors.toList());
//        for (int i = 0; i < children.size(); i++) {
//            children.set(i, children.get(i).toUpperCase());
//        }
    }

    @Override
    public void setNamesToLowerCase() {
        for (int i = 0; i < children.size(); i++) {
            children.set(i, children.get(i).toLowerCase());
        }
    }

    @Override
    public String toString() {
        return "ChildrenRepository{" +
                "children=" + children +
                '}';
    }

    private boolean isValid(String child) {
        if (child == null || child.isBlank()) {
            return false;
        }
        Pattern pattern = Pattern.compile("[a-z A-Z]+");
        return pattern.matcher(child).matches();
    }

}