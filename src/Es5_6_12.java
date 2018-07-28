/**
 * 27 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 *
 * Traccia: a) realizzare il metodo shift
 * 			b) main che usa shift in un ciclo fino a quando l'ultima lettera e la prima della parola shiftata non sono uguali ad 'a'
 */
import java.util.Scanner;

public class Es5_6_12 {

	public static String shift(String s, int n){
		return s.substring(n, s.length()) + s.substring(0, n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una stringa e un numero: ");
		String s = tastiera.next();
		int n = tastiera.nextInt();
		String shiftata = shift(s, n);
		while(shiftata.charAt(0) != shiftata.charAt(s.length()-1) || shiftata.charAt(0) != 'a'){
			System.out.println("La parola shiftata " + shiftata);
			System.out.println("Inserisci una stringa e un numero: ");
			s = tastiera.next();
			n = tastiera.nextInt();
			shiftata = shift(s, n);
		}
		System.out.println("La parola shiftata " + shiftata);
		System.out.println("Sono uscito");
	}

}
