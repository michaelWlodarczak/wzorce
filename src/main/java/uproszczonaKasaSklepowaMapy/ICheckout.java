package uproszczonaKasaSklepowaMapy;

//Utworz progam uproszczona kase sklepowa
//        Mamy klase produktu, ktora zawiera 3 pola
//        nazwa produktu
//        kod produktu
//        cene produktu
//        Menu programu
//        Dodaj produkt do bazy
//        Usun produkt z bazy
//        Wyswietl liste produktow
//        Dodaj produkt do paragonu
//        Zamknij i podlicz paragon
//        Program bedzie korzystal z klasy produktu i pytal o kod kolejnych produktow do momentu zamkniecia paragonu i wyswietli podsumowanie paragonu. Postaraj sie skorzystac z zalet obiektowosci i interfejsow.

import java.util.List;

public interface ICheckout {

    void addProductToProductList(Product product);
    void removeProductFromProductList(Product product);
    List<Product> getProductFromProductList();
    void addProductToBill(String barcode);
    String cloeAndPrintReceipt();

}
