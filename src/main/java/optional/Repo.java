package optional;

import java.util.Optional;

public class Repo {
    private String data;

    public Repo(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    //stosujemy tam gdzie mozemy spodziewac sie null, zastepujemy taka metode metoda zwracajaca optional
    //przykladowo nie bedziemy stosowac optional na klasie Child na metodzie getName(),
    //tam nadal typem zwracanym bedzie string
    public Optional<String> getDataOptional() {

//        //uzywamy kiedy jestesmy pewni, ze data jest null
//        if (data == null) {
//            return Optional.empty();
//        }
//        //kiedy wiemy, ze data nie jest null
//        //rzuci wyjatek, kiedy data bedzie null
//        if (data != null) {
//            return Optional.of(data);
//        }

        //tutaj obslugujemy oba przypadki, zadziala dla null i nie null
        return Optional.ofNullable(data);
    }
}
