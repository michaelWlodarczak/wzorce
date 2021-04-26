package uproszczonaKasaSklepowaMapy;

public class CheckoutApp {
    public static void main(String[] args) {
        Product water = new Product("Cisowianka", "123",20);
        Product book = new Product("Book", "987",40);

        ICheckout checkout = new CheckoutMachine();

        checkout.addProductToProductList(water);
        checkout.addProductToProductList(book);
        System.out.println(checkout.getProductFromProductList());
    }
}
