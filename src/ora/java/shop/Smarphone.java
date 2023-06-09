package ora.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smarphone extends Product{

    //campi
    private String IMEI ="";
    private int memoryGB;

    //costruttori

    public Smarphone(String name, String description, BigDecimal price, BigDecimal iva, int memoryGB) {
        super(name, description, price, iva);
        this.memoryGB = memoryGB;

        Random rand = new Random();

        while(IMEI.length() < 15) {
            this.IMEI = IMEI + rand.nextInt(1, 9);
        }
    }

    //getter e setter

    public int getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(int memoryGB) {
        this.memoryGB = memoryGB;
    }

    public String getIMEI() {
        return IMEI;
    }

    // sconto fedeltà


    @Override
    public String toString() {
        return "Name: " + getName() + "Descrizione: " + getDescription() + "Prezzo: " + getPrice() + "Iva: " + getIva() + "Code: " + getCode() + "IMEI: " + IMEI + "memory: " + memoryGB;

    }
}
