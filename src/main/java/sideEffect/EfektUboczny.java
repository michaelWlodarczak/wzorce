package sideEffect;

import java.util.Arrays;

public class EfektUboczny {
    public static void main(String[] args) {

        Child john = new Child("John","Rambo");

       Child[] children = new Child[1];
        children[0] = john;

        System.out.println(Arrays.toString(children));

        john.setSurname("Terminator");

        System.out.println(Arrays.toString(children));

        ChildrenRepo repository = new ChildrenRepo();
        repository.addChildren(john);
        System.out.println(repository);

        System.out.println(john);
    }
}