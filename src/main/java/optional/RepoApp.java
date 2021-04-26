package optional;

import java.util.Optional;
import java.util.function.Consumer;

public class RepoApp {

    public static void main(String[] args) {
        //Repo repo = new Repo(null);
        Repo repo = new Repo("dane w repo");

        if (repo.getData() != null)
            System.out.println(repo.getData().toUpperCase());

        Optional<String> dataOptional = repo.getDataOptional();
        if (dataOptional.isPresent()) {
            System.out.println("Print from optional");
            System.out.println(dataOptional.get());
        }
        //void accept(T t);
        Consumer<String> consumer = data -> System.out.println(data + " hello from lambda");
        dataOptional.ifPresent(consumer);

        repo.getDataOptional().ifPresent(data -> System.out.println(data + " hello from lambda advance !"));


    }
}
