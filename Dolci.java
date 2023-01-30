package McDonalds;

import java.util.Scanner;

public class Dolci {
    public static int quantity3[] = new int[11];

    public static float amt3 = 0.0F;

    public static String name3[] = new String[11];

    static float prezzo3[] = new float[11];

    public static void menu3()
    {
        Scanner input = new Scanner(System.in);
        int choise3, choise33 = 0;
        float qu3 = 0.0F;

        String q3[] = {
                "Muffin con Nutella       ",
                "Muffin Mirtilli       ",
                "Muffin Cioccolato       ",
                "Cheesecake con Fragole       ",
                "Cheesecake Cioccolato       ",
                "Cheesecake Monterosa       ",
                "Mini Muffin       ",
                "Croissant Integrale       ",
                "Croissant Crema       ",
                "Croissant Marmellata       ",
                "Re Cacao       "
        };

        float p3[] = {
                (float) 2.02          ,
                (float) 1.54         ,
                (float) 1.92          ,
                (float) 2.75          ,
                (float) 2.75          ,
                (float) 2.75          ,
                (float) 2.57          ,
                (float) 1.01          ,
                (float) 1.02          ,
                (float) 1.02          ,
                (float) 1.02
        };

        do {
            System.out.println("I dolci sono: ");
            System.out.println("[1] Muffin con Nutella...................€2.02");
            System.out.println("[2] Muffin Mirtilli......................€1.54");
            System.out.println("[3] Muffin Cioccolato....................€1.92");
            System.out.println("[4] Cheesecake con Fragole...............€2.75");
            System.out.println("[5] Cheesecake Cioccolato................€2.75");
            System.out.println("[6] Cheesecake Monterosa.................€2.75");
            System.out.println("[7] Mini Muffin..........................€2.57");
            System.out.println("[8] Croissant Integrale..................€1.01");
            System.out.println("[9] Croissant Crema......................€1.02");
            System.out.println("[10] Croissant Marmellata................€1.02");
            System.out.println("[11] Re Cacao............................€1.02");

            System.out.println("Ordina il tuo dolce: ");
            choise3 = input.nextInt();

            if (choise3>11||choise3<1){
                System.out.println("Errore");
            }
            else {
                System.out.println("Inserire quantità: ");
                qu3 = input.nextInt();
                for (int i = 0; i<11; i++){
                    if (i==(choise3-1)){
                        quantity3[i] += qu3;
                        name3[i] = q3[i];
                        prezzo3[i] = p3[i] * qu3;
                        System.out.println("Hai acquistato "+qu3+" "+q3[i]+" per €"+prezzo3[i]);
                    }
                }
            }
            for (int i = 0; i<11; i++){
                amt3 = amt3 + prezzo3[i];
            }
            System.out.println("Vuoi ordinare qualcos'altro?\n [1] se si, [0] se no");
            choise33 = input.nextInt();
        }while (choise33 != 0);
        System.out.println("Il Totale dei dolci è €"+amt3);
    }


}
