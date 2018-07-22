/**
 * 22 lug 2018
 * Progetti dal libro "Programmazione di base e avanzata con Java"
 * Stefano Alberotanza
 */
import java.util.Scanner;

public class progetto4_5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci i tuoi voti e termina \ncon un numero negativo");
		int countTot, countOtt, countDist, countDiscr, countBuon, countInsu, countSuff;
		countTot = countOtt = countDist = countBuon = countInsu = countDiscr = countSuff = 0;
		int prossimo = tastiera.nextInt(); 
		while(prossimo >= 0 ){
			countTot++;
			switch(prossimo){
				case(30):
				case(29):
					countOtt++;
					break;
				case(28):
				case(27):
				case(26):
					countDist++;
					break;
				case(25):
				case(24):
				case(23):
					countBuon++;
					break;
				case(22):
				case(21):
				case(20):
					countDiscr++;
					break;
				case(19):
				case(18):
					countSuff++;
					break;
				default:
					countInsu++;
					break;
			}
			prossimo = tastiera.nextInt();
		}
		System.out.println("Numero totale di voti: " + countTot);
		System.out.println("Numero di ottimi: " + countOtt);	
		System.out.println("Numero di distinti: " + countDist);
		System.out.println("Numero di buoni: " + countBuon);
		System.out.println("Numero di discreti: " + countDiscr);
		System.out.println("Numero di sufficienti: " + countSuff);
		System.out.println("Numero di insufficienti: " + countInsu);
		
	}

}
