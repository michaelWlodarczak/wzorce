package nameRepo;

public interface NamesRepo {

    void sort();
    void add(String name);
    void remove(String name);
    boolean isRepoFull();
}
