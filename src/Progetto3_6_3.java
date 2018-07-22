/**
 * 21 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class Progetto3_6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci due parole seguite da uno spazio");
		String s1,s2;
		s1 = tastiera.next();
		s2 = tastiera.next();
		System.out.println("In ordine lessinografico si presenta prima la parola");
		if (s1.compareTo(s2)<0) {
			System.out.print(s1);
		} else {
			System.out.print(s2);
		}
	}

}
