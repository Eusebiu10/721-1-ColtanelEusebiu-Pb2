package Model;

import java.util.Objects;

public class Product {
    private Integer id;
    private String name;
    private Integer Price;

    public Product(Integer id,String name,Integer Price)
    {
        this.id = id;
        this.name = name;
        this.Price = Price;

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(Price, product.Price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, Price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Price=" + Price +
                '}';
    }
}
