package uproszczonaKasaSklepowaMapy;

import java.util.*;

public class CheckoutMachine implements ICheckout {

    private Map<String, Product> products = new HashMap<>();
    private List<String> bill = new ArrayList<>();


    @Override
    public void addProductToProductList(Product product) {
        products.put(product.getBarCode(), product);
    }

    @Override
    public void removeProductFromProductList(Product product) {
        products.remove(product.getBarCode());
    }

    @Override
    public List<Product> getProductFromProductList() {
        List<Product> tempProducts = new ArrayList<>();
        Set<Map.Entry<String, Product>> productsSet = products.entrySet();
        for (Map.Entry<String, Product> entry : productsSet){
            tempProducts.add(entry.getValue());
        }
        return tempProducts;
    }

    @Override
    public void addProductToBill(String barcode) {

    }

    @Override
    public String cloeAndPrintReceipt() {
        return null;
    }
}
