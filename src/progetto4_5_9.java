/**
 * 23 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class progetto4_5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci un saldo e un tasso di interesse: ");
		double saldo, tasso, saldoVar, tassoGiorn, tassoMens;
		saldo = tastiera.nextDouble();
		tasso = tastiera.nextDouble();
		saldoVar = saldo;
		tassoGiorn = tasso/365;
		tassoMens = tasso/12;
		int i = 0;
		while(i <= 365){
			saldoVar += saldoVar/100*tassoGiorn;
			i++;
		}
		System.out.println("Il saldo con tasso giornaliero è: " + saldoVar);
		
		saldoVar = saldo;
		i = 1;
		while(i <= 12){
			saldoVar += saldoVar/100*tassoMens;
			i++;
		}		
		System.out.println("Il saldo con tasso mensile è: " + saldoVar);

		System.out.println("Il saldo con tasso annuo è: " + (saldo + saldo/100*tasso));
	}
}
