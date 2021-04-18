package childrenRepository;

public interface IChildrenRepository {

    boolean addChild(String child);

    String getChildren();

    void sortChildren();

    void removeDuplicates();

    void setNamesToUpperCase();

    void setNamesToLowerCase();
}
