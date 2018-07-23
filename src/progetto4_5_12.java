/**
 * 23 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class progetto4_5_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci la velocità iniziale e l'altezza del lancio:  ");
		double vel = tastiera.nextDouble();
		double h = tastiera.nextDouble();
		int countRimb = 0;
		int count = 0;
		System.out.println("Tempo: 0 Altezza: " + h);
		h += vel;
		while(countRimb < 5){
			while(h > 0){
				count++;
				System.out.println("Tempo: " + count + " Altezza: " + h);
				vel -= 96;
				h += vel;
			}
			countRimb++;
			System.out.println("Rimbalzo!");
			vel = vel*-0.5;
			h = h*-0.5;
		}
	}

}
