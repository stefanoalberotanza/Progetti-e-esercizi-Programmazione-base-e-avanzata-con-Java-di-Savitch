/**
 * 23 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class progetto4_5_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci il numero di barrette che hai preso: ");
		int n, count, countBar, countGrat;
		n = tastiera.nextInt();
		count = countBar = countGrat = 0;
		while(n > 0){
			count++;
			n--;
			countBar++;
			if(countBar%6 == 0){
				count++;
				countBar = 1;
				countGrat++;
			}
		}
		System.out.println("Hai diritto a " + count + " barrette.");
		System.out.println("Di cui " + countGrat + " gratis!");
	}

}
