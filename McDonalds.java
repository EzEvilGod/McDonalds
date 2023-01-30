package McDonalds;

import java.io.IOException;
import java.util.Scanner;

public class McDonalds {

    static float tot = 0;
    static int conto = 1;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int c, c1;
        float scontrino, Iva = 0.0F;

        System.out.println("\n");
        System.out.println(" WW      WW EEEEE L     CCC OOOO   MM  MM   EEEEE    TTTTT OOOO");
        System.out.println("  WW WW WW  EEE   L    C    O  O  MM MM MM  EEE        T   O  O");
        System.out.println("   WW  WW   EEEEE LLLL  CCC OOOO MM      MM EEEEE      T   OOOO");
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("     MM  MM        DDD  OOOO NN  N    A    L    DDD  SSSS");
        System.out.println("    MM MM MM   CCC D  D O  O N N N   A A   L    D  D  S  ");
        System.out.println("   MM      MM C    D  D O  O N  NN  AAAAA  L    D  D   S ");
        System.out.println("  MM        MM CCC DDD  OOOO N   N A     A LLLL DDD  SSSS");
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("                      I'M LOVIN' IT                            ");
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");


        do{
            System.out.println("[1] Panini e wraps");
            System.out.println("[2] Bevande");
            System.out.println("[3] Dolci");

            System.out.println("Inserisci scelta: ");
            c = input.nextInt();

            switch (c)
            {
                case 1:
                    Panini_wraps pn = new Panini_wraps();
                    pn.menu1();
                    break;
                case 2:
                    bevande bv = new bevande();
                    bv.menu2();
                    break;
                case 3:
                    Dolci dc = new Dolci();
                    dc.menu3();
            }

            System.out.println("Vuoi continuare a comprare altri prodotti?\nPremere [1] si, [0] no");
            c1 = input.nextInt();
        }while (c1!=0);
        if (c1 == 0){
            tot = Panini_wraps.amt1 + bevande.amt2 + Dolci.amt3;
        }
        Iva = (float) (0.04*tot);
        scontrino = tot+Iva;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                    McDonalds");
        System.out.println("                  I'm Lovin' it ");
        System.out.println("Nome"+"\t\t\t"+"          Quantità"+"\t\t\t  "+"Prezzo");
        System.out.println("==================================================================================");

        System.out.println("\n\n");
        for (int i = 0; i<19; i++){
            if(Panini_wraps.quantity1[i]>0) {
                System.out.println("Nome: "+ Panini_wraps.name1[i]+ "quantità: " + Panini_wraps.quantity1[i] + "\t\t\t Prezzo: " + Panini_wraps.prezzo1[i]);
            }
        }

        for (int i = 0; i<15; i++){
            if (bevande.quantity2[i]>0){
            System.out.println("Nome: "+ bevande.name2[i]+ "quantità: " + bevande.quantity2[i]+ "\t\t\t Prezzo: " + bevande.prezzo2[i]);
            }
        }

        for (int i = 0; i<11; i++){
            if (Dolci.quantity3[i] > 0) {
                System.out.println("Nome: "+ Dolci.name3[i]+ "quantità: " + Dolci.quantity3[i] + "\t\t\t Prezzo: " + Dolci.prezzo3[i]);
            }
        }

        System.out.println("\n");
        System.out.println("totale (senza iva) è di = "+tot);
        System.out.println("Iva è di = "+Iva);
        System.out.println("Il totale (iva incluso) è di = "+scontrino);
        Payment pay = new Payment();
        pay.Pay();
        System.out.println("-----------Thank you----------");
        System.out.println("**** :) Visit again :)**** ");
    }
}