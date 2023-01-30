package McDonalds;

import java.util.Scanner;

public class bevande {
    public static int quantity2[] = new int[15];
    public static float amt2 = 0.0F;
    public static String name2[] = new String[15];
    static float prezzo2[] = new float[15];
    public static void menu2()
    {
        Scanner input = new Scanner(System.in);
        int choise2, choise22;
        float qu2;
        String q2[] = {
                "Coca Cola       ",
                "Coca Cola Zero       ",
                "Fanta       ",
                "Sprite       ",
                "Lipton Ice Tea Pesca       ",
                "Lipton Ice tea Limone       ",
                "Spremuta fresca d'arancia       ",
                "Acqua frizzante       ",
                "Acqua naturale       ",
                "Succo Bio di Mela       ",
                "Spremuta d'arancia       ",
                "Succo ACE       ",
                "Succo di frutta alla Pera       ",
                "Succo di frutta alla Pesca       ",
                "Succo di frutta all'Ananas       "
        };

        float p2[] = {
                (float) 1.70          ,
                (float) 1.70          ,
                (float) 1.70          ,
                (float) 1.70          ,
                (float) 1.70          ,
                (float) 1.70          ,
                (float) 2.57          ,
                (float) 1.05          ,
                (float) 1.05          ,
                (float) 1.03          ,
                (float) 2.37          ,
                (float) 2.34          ,
                (float) 2.34          ,
                (float) 2.34          ,
                (float) 2.34
        };

        do {
            System.out.println("Le bevande sono: ");
            System.out.println("[1] Coca Cola...............................................€1.70");
            System.out.println("[2] Coca Cola Zero..........................................€1.70");
            System.out.println("[3] Fanta...................................................€1.70");
            System.out.println("[4] Sprite..................................................€1.70");
            System.out.println("[5] Lipton Ice Tea Pesca....................................€1.70");
            System.out.println("[6] Lipton Ice tea Limone...................................€1.70");
            System.out.println("[7] Spremuta fresca d'arancia...............................€2.57");
            System.out.println("[8] Acqua frizzante.........................................€1.05");
            System.out.println("[9] Acqua naturale..........................................€1.05");
            System.out.println("[10] Succo Bio di Mela......................................€1.03");
            System.out.println("[11] Spremuta d'arancia.....................................€2.37");
            System.out.println("[12] Succo ACE..............................................€2.34");
            System.out.println("[13] Succo di frutta alla Pera..............................€2.34");
            System.out.println("[14] Succo di frutta alla Pesca.............................€2.34");
            System.out.println("[15] Succo di frutta all'Ananas.............................€2.34");

            System.out.println("Ordina la tua bevanda: ");
            choise2 = input.nextInt();

            if(choise2>15||choise2<1){
                System.out.println("Errore");
            }
            else{
                System.out.println("Inserisci la quantità: ");
                qu2 = input.nextInt();
                for (int i = 0; i<15; i++){
                    if (i==(choise2-1)){
                        quantity2[i] += qu2;
                        name2[i] = q2[i];
                        prezzo2[i] = p2[i] * qu2;
                        System.out.println("Hai acquistato "+qu2+" "+q2[i]+" per €"+prezzo2[i]);
                    }
                }
            }
            for (int i = 0; i<15; i++) {
                amt2 = amt2 + prezzo2[i];
            }
            System.out.println("Vuoi ordinare qualcos'altro\n [1] se si, [0] se no");
            choise22 = input.nextInt();
        } while (choise22 != 0);
        System.out.println("Il Totale delle bevande è €"+amt2);
    }
}
