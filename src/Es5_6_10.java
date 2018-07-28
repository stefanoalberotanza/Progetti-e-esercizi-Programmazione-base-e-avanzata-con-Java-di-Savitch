/**
 * 27 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 *
 * Traccia: salvare il numero di vocali maggiori tra le parole inserite fino alla parola fine
 */
import java.util.Scanner;

public class Es5_6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String s;
		int max, n = 0;
		String piulunga;
		max = 0;
		s = tastiera.next();
		while(s.indexOf("fine") < 0){
			n = Es5_6_5.contaVocali(s);
			if(n > max){
				max = n;
				piulunga = s;
			}
			System.out.println("Inserisci una parola");
			s = tastiera.next();
		}
		System.out.println("La parola con più vocali ne aveva " + n);
	}

}
