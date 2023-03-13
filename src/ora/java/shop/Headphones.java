package ora.java.shop;

import java.math.BigDecimal;

public class Headphones extends Product{

    //campi
    private String color;
    private boolean wireless;

    //costruttori

    public Headphones(String name, String description, BigDecimal price, BigDecimal iva, String color, boolean wireless) {
        super(name, description, price, iva);
        this.color = color;
        this.wireless = wireless;
    }

    //getter e setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "Descrizione: " + getDescription() + "Prezzo: " + getPrice() + "Iva: " + getIva() + "Code: " + getCode() + "color: " + color + "wireless: " + wireless;
    }
}
