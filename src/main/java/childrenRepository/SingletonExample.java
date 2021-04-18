package childrenRepository;

public class SingletonExample {
    public static void main(String[] args) {

        IChildrenRepository repo = new ChildrenRepositoryBasic();
        repo.addChild("Krzys");
        repo.addChild("Krzys");

        IChildrenRepository repo2 = new ChildrenRepositoryBasic();
        repo2.addChild("Krzys");
        repo2.addChild("Krzys");

        System.out.println(repo2);

        System.out.println(ChildNumberGeneratorSingleton.getInstance().getNumber());
    }
}