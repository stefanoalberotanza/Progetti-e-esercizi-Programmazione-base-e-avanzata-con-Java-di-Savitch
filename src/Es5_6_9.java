/**
 * 27 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 *
 * Traccia: a) il metodo conta che accetta una stringa e un carattere e restituisce il numero di volte in cui questo compare
 * 			b) il metodo main che legge da input una stringa e un intero n. Applica conta alla stringa e al carattere in posizione n.
 */
import java.util.Scanner;

public class Es5_6_9 {
	
	public static int conta(String frase, char lettera){
		int i, count;
		i = count = 0;
		if(frase.indexOf(lettera) < 0){
			return 0;
		}
		while(i < frase.length()){
			if(frase.charAt(i) == lettera){
				count++;
			}
			i++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scrivi una frase:");
		String s;
		s = tastiera.nextLine();
		System.out.println("Inserisci una lettera:");
		char l;
		l = tastiera.next().charAt(0);
		System.out.println("Il numero di volte in cui compare il carattere " + l + " è " + conta(s,l));
	}

}
