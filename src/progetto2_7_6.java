import java.util.Scanner;
/*20/07/2018
 *Stefano Alberotanza
 */
public class progetto2_7_6 {

	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Scrivi una temperatura in Fahrenei");
		int gradiFahreneit = tastiera.nextInt();
		double gradiCelsius = 5*((double)gradiFahreneit - 32)/9;
		
		System.out.printf("%d gradi Fahreneit corrispondono a %3.1f gradi Celsius.", gradiFahreneit,gradiCelsius);
	}

}
