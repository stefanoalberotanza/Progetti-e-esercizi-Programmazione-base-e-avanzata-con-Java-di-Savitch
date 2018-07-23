/**
 * 21 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class progetto2_7_13 {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci, separati da uno spazio, il tuo peso, la tua altezza in cm e la tua età:");
		double p = tastiera.nextDouble();
		double h = tastiera.nextDouble();
		int e = tastiera.nextInt();
		System.out.printf("Se sei una donna dovrai consumare %4.2f barrette di cioccolato \n", ((655 + (9.6*p) + (1.8*h) - (4.7*(double)e)/230)));
		System.out.printf("Se sei un uomo dovrai consumare %4.2f barrette di cioccolato", ((68 + (13.8*p) + (5.0*h) - (6.8*(double)e)/230)));
		
	}

}
