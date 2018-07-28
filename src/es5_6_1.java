/**
 * 24 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class es5_6_1 {

	public static int confronta(int a, int b){
		if(a >= b){
			return a - b;
		}else {
			return b - a;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scrivi due numeri diversi: ");
		int a, b, risultato;
		a = tastiera.nextInt();
		b = tastiera.nextInt();
		risultato = confronta(a,b);
		System.out.println(risultato);
		
		
	}

}
