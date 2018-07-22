/**
 * 22 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */

import java.util.Scanner;

public class progetto4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		//int prossimo, countTot, countOtt, countDist, count;
		System.out.println("Inserisci la sequenza di interi positivi e \nterminala con un numero negativo.");
		int prossimo, somma, max, min, count;
		prossimo = tastiera.nextInt();
		min = max = prossimo;
		somma = max  = count = 0;
		while(prossimo >= 0){
			count++;
			somma = somma + prossimo;
			if(prossimo > max) {
				max = prossimo;
			}
			if(prossimo < min){
				min = prossimo;
			}
			prossimo = tastiera.nextInt();
		}
		
		System.out.printf("Il numero massimo inserito è: %d \nIl numero minimo inserito è: %d \nLa media dei numeri inseriti è: %4.2f", max, min, ((double)somma)/count);
	}

}
