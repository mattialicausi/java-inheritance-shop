package ora.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    public Product(String name, String description, BigDecimal price, BigDecimal iva) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;

        Random rand = new Random();
        this.code = rand.nextInt(1000) + 1;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal basePrice() {
        return price;
    }

    public BigDecimal ivaPrice() {
        BigDecimal ivaSulPrezzo = price.multiply(iva);
        return price.add(ivaSulPrezzo).setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
