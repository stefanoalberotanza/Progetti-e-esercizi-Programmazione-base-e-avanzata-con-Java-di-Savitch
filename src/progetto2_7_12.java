/**
 * 20 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;


public class progetto2_7_12 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il raggio del tubo in metri");
		double r = tastiera.nextDouble();
		System.out.println("Inserisci l'altezza del tubo in metri");
		double h = tastiera.nextDouble();
		System.out.printf("Il tuo tubo può contenere al più %6.2f", 3.14*r*r*h*1000);
	}

}
