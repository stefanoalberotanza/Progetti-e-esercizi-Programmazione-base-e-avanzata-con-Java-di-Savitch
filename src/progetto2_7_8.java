import java.util.Scanner;
/*20/07/2018
 *Stefano Alberotanza
 */
public class progetto2_7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scrivi una riga di testo senza punteggiatura. ");
		String s = tastiera.nextLine();
		String firstWord = s.substring(0, s.indexOf(" "));
		System.out.println("La riga è stata modificata in: \n" + s.substring(firstWord.length() + 1, s.length()) + " " + firstWord);
	}

}
