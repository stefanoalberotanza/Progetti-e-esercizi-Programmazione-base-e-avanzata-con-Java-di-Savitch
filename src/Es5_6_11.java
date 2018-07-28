/**
 * 27 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 *
 * Traccia: a) realizzare metodo inverti che inverte una parte di una stringa, a partire dalla n-esima lettera, con n in input
 *			b) metodo main che chiede un intero e una stringa per applicare il metodo inverti
 */			
import java.util.Scanner;

public class Es5_6_11 {
	
	public static String inverti(String parola, int n){
		if(n > parola.length()){
			return "errore";
		}
		String invertita = "" + parola.substring(0, n);
		int i = 0;
		parola = parola.substring(n, parola.length());
		while(i < parola.length()){
			invertita = invertita + parola.charAt(parola.length() - i - 1);
			i++;
		}
		return invertita;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una parola e un numero: ");
		String s;
		int n;
		s = tastiera.next();
		n = tastiera.nextInt();
		System.out.println("Questa è la parola: " + inverti(s, n));
	}

}
