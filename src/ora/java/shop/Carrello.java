package ora.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanti prodotti vuoi acquistare? ");
        int nProducts = Integer.parseInt(scan.nextLine());

        Product productList[] = new Product[nProducts];

        int counter = 0;
        BigDecimal totalPrice = BigDecimal.ZERO;


        for (int i = 0; i < nProducts; i++) {

            // chiedo all'utente che tipologia di prodotto vuole prendere
            System.out.println("Che prodotto cerchi? 1-smartphone,  2-television,  3-headphones, 4-esci");
            int choose = Integer.parseInt(scan.nextLine());

            // operazioni in base alla scelta
            if(choose == 1) {
                // smartphone
                System.out.println("hai scelto i telefoni");

                //chiedo all'utente info per il prodotto
                System.out.print("Come si chiama il prodotto? ");
                String sName = scan.nextLine();

                System.out.print("La descrizione del prodotto? ");
                String sDescription = scan.nextLine();

                System.out.print("Il prezzo? ");
                BigDecimal sPrice = new BigDecimal(scan.nextLine());

                System.out.print("iva? ");
                BigDecimal sIva = new BigDecimal(scan.nextLine());


                System.out.print("Memoria? ");
                int sMemory = Integer.parseInt(scan.nextLine());

                Smarphone s1 = new Smarphone(sName, sDescription, sPrice, sIva, sMemory);
                //System.out.println("Hai scelto" + s1);

                // Aggiungi il prodotto creato all'array
                productList[counter] = s1;
                counter++;
                totalPrice = totalPrice.add(s1.ivaPrice());

            } else if(choose == 2) {
                //television
                System.out.println("hainscelto le tv");

                //chiedo all'utente info per il prodotto
                System.out.print("Come si chiama il prodotto? ");
                String sName = scan.nextLine();

                System.out.print("La descrizione del prodotto? ");
                String sDescription = scan.nextLine();

                System.out.print("Il prezzo? ");
                BigDecimal sPrice = new BigDecimal(scan.nextLine());

                System.out.print("iva? ");
                BigDecimal sIva = new BigDecimal(scan.nextLine());


                System.out.print("Dimensione? ");
                int sDimension = Integer.parseInt(scan.nextLine());

                System.out.print("E'smart? ");
                boolean sSmart = scan.nextBoolean();

                Television t1 = new Television(sName, sDescription, sPrice, sIva, sDimension, sSmart);
                //System.out.println("Hai scelto" + t1);

                // Aggiungi il prodotto creato all'array
                productList[counter] = t1;
                counter++;
                totalPrice = totalPrice.add(t1.ivaPrice());

            } else if (choose == 3) {
                //headphones
                System.out.println("hai scelto le cuffie");

                //chiedo all'utente info per il prodotto
                System.out.print("Come si chiama il prodotto? ");
                String sName = scan.nextLine();

                System.out.print("La descrizione del prodotto? ");
                String sDescription = scan.nextLine();

                System.out.print("Il prezzo? ");
                BigDecimal sPrice = new BigDecimal(scan.nextLine());

                System.out.print("iva? ");
                BigDecimal sIva = new BigDecimal(scan.nextLine());


                System.out.print("Il colore? ");
                String sColor = scan.nextLine();

                System.out.print("E'wireless? ");
                boolean sWireless = scan.nextBoolean();

                Headphones h1 = new Headphones(sName, sDescription, sPrice, sIva, sColor, sWireless);
                //System.out.println("Hai scelto" + h1);

                // Aggiungi il prodotto creato all'array
                productList[counter] = h1;
                counter++;
                totalPrice = totalPrice.add(h1.ivaPrice());

            } else if(choose ==4){
                System.out.println("Grazie, arrivederci");
                return;
            } else {
                //errato
                System.out.println("Non valido, riprova");
            }


            for (Product value : productList){
                System.out.println(value);
            }

        }
        System.out.println("Totale " + totalPrice + "€");
    }
}
