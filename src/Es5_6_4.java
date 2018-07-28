/**
 * 24 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class Es5_6_4 {

	public static boolean isInRange(int min, int max, int valore){
		if(valore>=min && valore<=max){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci 3 interi:");
		int n1,n2,n3;
		n1 = tastiera.nextInt();
		n2 = tastiera.nextInt();
		n3 = tastiera.nextInt();
		System.out.println( n3 + (isInRange(n1,n2,n3)?"":" non") +" è nell'intervallo [" + n1 + "," + n2 + "].");
	}
}
