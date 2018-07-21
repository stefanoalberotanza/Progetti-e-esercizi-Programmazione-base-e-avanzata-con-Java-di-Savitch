import java.util.Scanner;

/*20/07/2018
 *Stefano Alberotanza
 */

public class progetto2_7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scrivi una riga di testo: ");
		String s = tastiera.nextLine();
		int n = s.indexOf("odio");
		System.out.println("La riga è stata modificata in: \n" + s.substring(0, n) + "amo" + s.substring(n+4, s.length()));
	}
}
