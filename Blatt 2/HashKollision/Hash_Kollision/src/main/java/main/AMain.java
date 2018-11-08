package main;

/*
 * TODO:
 * Klasse Main von dieser Klasse ableiten und fehlende Methoden
 * implementieren:
 * - main()
 * - sucheKlartext()
 */

public abstract class AMain {
	
	/*
	 * Menge der erlaubten Zeichen
	 */
	protected static char[] erlaubteZeichen = {
			'a', 'b', 'c', 'd', 'e', 'f',
			'g', 'h', 'i', 'j', 'k', 'l',
			'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x',
			'y', 'z'
	};
	
	/*
	 * Länge der Zeichensequenz mit Elementen aus erlaubteLetter,
	 *  aus der der gesuchte Hash erzeugt wurde
	 */
	protected static int kSequenzLänge = 4;
	
	/*
	 * der gesuchte Hash
	 */
	protected static String hash = "359d51e2c46117671b4bec69989e1652967de47e4415fbb31f6e5d3dd653f7310f2f8a62b91699d842c694f8e6d4475b419669a71af169c64b81cb70d1afd7";
	
	/*
	 * Anzahl der nebenläufigen Threads, die Brute-Force mäßig nach dem
	 * gesuchten Hash suchen sollen.
	 */
	protected static int nAnzahlThreads = 4;

}
