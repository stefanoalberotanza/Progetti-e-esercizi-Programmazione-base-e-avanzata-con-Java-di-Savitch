/**
 * 21 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class es4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SECRET_CODE = 5843;
		int A,B,C,D;
		A = SECRET_CODE/1000;
		B = SECRET_CODE/100%10;
		C = SECRET_CODE/10%10;
		D = SECRET_CODE%10;
		
		Scanner tastiera = new Scanner(System.in);
		int a,b,c,d,n,count;
		count = 0;
		
		while(count < 4){
			//System.out.printf("Le cifre che hai inserito sono %d e %d e %d e %d", a,b,c,d );
			System.out.println("Inserisci il codice: ");
			n = tastiera.nextInt();
			a = n/1000;
			b = n/100%10;
			c = n/10%10;
			d = n%10;	
			count = 0;
			
			int somma = 0;
			
			if(a == A){
				count++;
				somma = somma + a;
			}
			
			if(b == B){
				count++;
				somma = somma + b;
			}
			
			if(c == C){
				count++;
				somma = somma + c;
			}
			
			if(d == D){
				count++;
				somma = somma + d;
			}
			
			if(count != 4)
				System.out.printf("Ci sono %d numeri corretti e la loro somma è: %d. \n", count,somma);
		}
		
		System.out.println("Bravo, il codice era proprio: " + SECRET_CODE);
	}

}
