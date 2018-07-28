/**
 * 24 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class Es5_6_5 {

	public static int contaVocali(String parola){
		int count, i;
		i = count = 0;
		while(i < parola.length()){
			char lettera = parola.charAt(i);
			if(lettera == 'a' || lettera == 'e' || lettera == 'i' || lettera == 'o' || lettera == 'u'){
				count++;
			}
			i++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una parola di almeno 5 vocali: ");
		String s;
		s = tastiera.next();
		
		while(contaVocali(s) < 5){
			System.out.println("Non aveva almeno 5 vocali, riprova!");
			s = tastiera.next();
		}
		System.out.println("Bravo! Questa parola aveva " + contaVocali(s) + " vocali.");
	}

}
