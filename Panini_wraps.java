package McDonalds;

import java.util.Scanner;

public class Panini_wraps {
    public static int quantity1[] = new int [19];
    public static float amt1 =  0.0F;
    public static String name1[] = new String[19];
    static float prezzo1[] = new float[19];
    public static void menu1(){
        Scanner input = new Scanner(System.in);
        int choise, choise1;
        float qu1;
        String q1[] = {
                "Hamburger       ",
                "Cheeseburger          ",
                "Chickenburger          ",
                "Double Chicken BBQ          ",
                "Filt-O-Fish          ",
                "McToast          ",
                "Gluten Free Bruger          ",
                "Double Cheeseburger          ",
                "Crispy McBacon          ",
                "My Selection Speck & Asiago          ",
                "My Selection Chicken Avocado & Bacon          ",
                "Crispy McWrap          ",
                "Gran Crispy McBacon          ",
                "McChicken          ",
                "Big Mac          ",
                "Egg Wrap          ",
                "Pollo Piccante          ",
                "Involtini di pollo piccanti          ",
                "Chicken McNuggets (6 pezzi)          "
        };

        float p1[] = {
                (float) 1.05          ,
                (float) 1.44          ,
                (float) 1.45          ,
                (float) 2.36          ,
                (float) 2.40          ,
                (float) 1.44          ,
                (float) 3.21          ,
                (float) 2.36          ,
                (float) 4.74          ,
                (float) 5.99          ,
                (float) 5.99          ,
                (float) 5.49          ,
                (float) 5.31          ,
                (float) 4.53          ,
                (float) 4.53          ,
                (float) 2.40          ,
                (float) 5.19          ,
                (float) 5.18          ,
                (float) 4.56
        };

        do {
            System.out.println("I Panini e wrap sono: ");
            System.out.println("[1] Hamburger..................................€1.05");
            System.out.println("[2] Cheeseburger...............................€1.44");
            System.out.println("[3] Chickenburger..............................€1.45");
            System.out.println("[4] Double Chicken BBQ.........................€2.36");
            System.out.println("[5] Filt-O-Fish................................€2.40");
            System.out.println("[6] McToast....................................€1.44");
            System.out.println("[7] Gluten Free Burger.........................€3.21");
            System.out.println("[8] Double Cheeseburger........................€2.36");
            System.out.println("[9] Crispy McBacon.............................€4.74");
            System.out.println("[10] My Selection Speck & Asiago...............€5.99");
            System.out.println("[11] My Selection Chicken Avocado & Bacon......€5.99");
            System.out.println("[12] Crispy McWrap.............................€5.49");
            System.out.println("[13] Gran Crispy McBacon.......................€5.31");
            System.out.println("[14] McChicken.................................€4.53");
            System.out.println("[15] Big Mac...................................€4.53");
            System.out.println("[16] Egg Wrap..................................€2.40");
            System.out.println("[17] Pollo Piccante............................€5.19");
            System.out.println("[18] Involtini di pollo piccanti...............€5.18");
            System.out.println("[19] Chicken McNuggets (6 pezzi)...............€4.56");

            System.out.println("Ordina il tuo panino: ");
            choise = input.nextInt();

            if(choise > 19 || choise < 1) {
                System.out.println("Errore");
            }
            else {
                System.out.println("Inserire la quantità: ");
                qu1 = input.nextInt();
                for (int i = 0; i<19; i++){
                    if (i==(choise-1))
                    {
                        quantity1[i] += qu1; //quantity[i] = quantity + qu
                        name1[i] = q1[i];
                        prezzo1[i] = p1[i] * qu1;
                        System.out.println("Hai acquistato "+qu1+" "+q1[i]+" per €"+prezzo1[i]);
                    }
                }
            }
            for (int i = 0; i<19; i++){
                amt1 = amt1 + prezzo1[i];
            }

            System.out.println("Vuoi ordinare qualcos'altro?\n [1] se si, [0] se no");
            choise1 = input.nextInt();
        }while (choise1 != 0);
        System.out.println("Il Totale dei panini e/o wrap ordinati sono: €"+amt1);
    }
}
