package McDonalds;

import java.io.IOException;
import java.util.Scanner;

public class Payment {
    static void Pay()throws IOException {
        Scanner input = new Scanner(System.in);
        int ch,b,edm,edy = 0,cv;
        String n;
        long cd;
        System.out.println("\n");
        System.out.println("Come vuoi pagare?");
        System.out.println("[1] Carta di debito");
        System.out.println("[2] Carta di credito");
        System.out.println("[3] Pagamento digitale");
        System.out.println("[4] Contanti alla consegna");
        ch = input.nextInt();
        if(ch<=0||ch>4){
            System.out.println("Errore, riprova di nuovo");
            ch = input.nextInt();
        }
        if (ch>=1 && ch <=3){
            System.out.println("Scegliere il nome della banca:");
            System.out.println("[1] Unicredit");
            System.out.println("[2] Intesa Sanpaolo");
            System.out.println("[3] Banca Popolare");
            b = input.nextInt();
        }
        if (ch == 1 || ch == 2){
            System.out.println("Inserire il nome della carta");
            n = input.next();
            System.out.println("Inserisci i 16 numeri digitali della carta");
            cd = input.nextLong();
            if(cd/Math.pow(10,15)<1 || cd/Math.pow(10,15)>9){
                System.out.println("Carta invalida, riprova");
                cd = input.nextLong();
            }
            System.out.println("Inserire il mese");
            edm = input.nextInt();
            if (edm<0 || edm>12){
                System.out.println("Il mese non esiste, riprova");
                edm = input.nextInt();
            }
            System.out.println("inserire i numeri CVV/CVC");
            cv = input.nextInt();
            if (cv/Math.pow(10,2)<1 || cv/Math.pow(10,2)>9){
                System.out.println("CVV e/o CVC errati, riprova");
            }
        }
        if (ch == 4){
                System.out.println("Dovrai inviare i tuoi contanti quando il ragazzo delle consegne arriva al tuo indirizzo");
            }
    }
}
