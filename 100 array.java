import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        Random Generatore = new Random();
        boolean controllo = true;
        System.out.println("scegli la lunghezza dell'array");
        int length = in.nextInt();
        int [] value = new int [length];
        do {
            System.out.println("1. caricamento tastiera");
            System.out.println("2. caricamento random");
            System.out.println("3. visualizzazione");
            System.out.println("4. inserimento in posizione");
            System.out.println("5. cancellazione di un elemento cercato");
            System.out.println("6. fine");

            int tabella = in.nextInt();

            switch (tabella) {
                case 1:
                    for (int i = 0; i < length; i ++){
                        System.out.println("inserisci il " + (i+1) + "° valore");
                        value [i] = in.nextInt();
                    }
                    break;

                case 2:
                    for (int i = 0; i < length; i ++){
                        value [i] = Generatore.nextInt (100);
                    }
                    break;

                case 3:
                    System.out.println("Ecco i valori del tuo array");
                    for (int i = 0; i < length; i ++){
                        System.out.println(value [i]);
                    }
                    break;

                case 4:
                    System.out.println("Quale elemento dell'array vuoi cambiare?");
                    int cambio = in.nextInt();
                    System.out.println("Che valore vuoi inserire?");
                    int numerosostitutivo = in.nextInt();
                    value [(cambio - 1)] = numerosostitutivo;

                    break;

                case 5:
                    System.out.println("Quale elemento dell'array vuoi eliminare");
                    int eliminato = in.nextInt();
                    value [(eliminato - 1)] = 0;
                    break;

                case 6:
                    controllo = false;
                    System.out.println("Programma terminato correttamente");
                    break;



            }

        }while (controllo);



    }
}