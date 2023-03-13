package ora.java.shop;

import java.math.BigDecimal;

public class Television extends Product{

    //campi
    private int dimension;
    private boolean smart;

    public Television(String name, String description, BigDecimal price, BigDecimal iva, int dimension, boolean smart) {
        super(name, description, price, iva);
        this.dimension = dimension;
        this.smart = smart;
    }

    //getter e setter

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "Descrizione: " + getDescription() + "Prezzo: " + getPrice() + "Iva: " + getIva() + "Code: " + getCode() + "Dimensione: " + dimension + "smart: " + smart;

    }
}
