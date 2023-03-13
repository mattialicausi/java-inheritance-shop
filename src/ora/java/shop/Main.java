package ora.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Iphone", "casa apple", new BigDecimal("799.99"), new BigDecimal("0.22"));
        System.out.println(p1);

        //stampo nel terminale il prodotto con i valori diversi
        System.out.println(p1.getName() + " " + p1.getDescription() + " " + p1.getPrice() +  " " + p1.getIva() + " " + p1.getCode());

        //stampo prezzo senza iva
        System.out.println("Prezzo base: " + p1.basePrice());

        //stampo prezzo con iva
        System.out.println("Prezzo con iva: " + p1.ivaPrice());



        // SMARTPHONE
        Smarphone s1 = new Smarphone("Iphone", "apple california", new BigDecimal("899.99"), new BigDecimal("0.22"), 256);
        System.out.println(s1);

        //TELEVISION
        Television t1 = new Television("Samsung", "di qualità", new BigDecimal("1200.00"), new BigDecimal("0.22"), 80, true);
        System.out.println(t1);

        //Headphones

        Headphones h1 = new Headphones("Pioneer", "cuffie buone", new BigDecimal("99.99"), new BigDecimal("0.22"), "white", true);
        System.out.println(h1);



    }
}
