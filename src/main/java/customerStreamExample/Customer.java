package customerStreamExample;

import java.util.Objects;

public class Customer {  // jezeli bedzie final zabezpieczymy  przed dziedziczeniem klasy

    private String name;
    private int point;

    public Customer(String name, int point) {
        this.name = name;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "customerStreamExample.Customer{" +
                "name='" + name + '\'' +
                ", point=" + point +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return point == customer.point && name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, point);
    }
}
