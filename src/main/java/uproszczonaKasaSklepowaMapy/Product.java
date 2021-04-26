package uproszczonaKasaSklepowaMapy;

public class Product {
    private String name;
    private String barCode;
    private int price;

    public Product(String name, String code, int price) {
        this.name = name;
        this.barCode = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBarCode() {
        return barCode;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", code='" + barCode + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
