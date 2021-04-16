import java.util.function.Predicate;

public class Predykat {
    public static void main(String[] args) {

/*        @FunctionalInterface
        public interface Predicate<T> {

            /**
             * Evaluates this predicate on the given argument.
             *
             * @param t the input argument
             * @return {@code true} if the input argument matches the predicate,
             * otherwise {@code false}
             */
       //     boolean test(T t);


            String michal = "Michal";
        Predicate<String> predicate;
        // 1.skopiuj argumenty
        // 2.postaw znaczek lambda
        // 3.dostarcz implementacje

        predicate = (String name) -> name.equals("Michal");
        predicate = T -> T.equals("michal");
        predicate = xx -> xx.length() == 0;
        System.out.println(predicate.test(michal));

    }
}
