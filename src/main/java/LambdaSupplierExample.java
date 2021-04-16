import java.util.function.Supplier;

public class LambdaSupplierExample {

    public static void main(String[] args) {

 /*       @FunctionalInterface
        public interface Supplier<T> {

            /**
             * Gets a result.
             *
             * @return a result
             */
       //     T get();
      //  }
        Supplier<String> stringSupplier;
        //1. skopiuj argumenty
        //2. postaw znaczek lamba
        //3. dostarcz implementacje

 /*     stringSupplier = () -> "Hello";
        stringSupplier = () -> "";
        stringSupplier = () -> {
            return "Hello";
        };    */
        stringSupplier = () -> "244355";

        String result = stringSupplier.get();
        System.out.println(result);
    }
}
