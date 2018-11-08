package main;

/*
 * TODO:
 * - implementieren Sie den Konstruktor
 * - implementieren Sie die run()-Methode
 * 
 */

public abstract class AHashCracker extends Thread {

	/*
	 *  Liste mit allen Kandidatenstrings
	 */
	protected String[] kandidatenListe;
	
	/*
	 *  Index des ersten Kandidatenstrings in Kandidatenliste,
	 *  der von diesem Thread Ã¼berprÃ¼ft wird
	 */
	protected int offset;
	
	/*
	 * Abstand zwischen den Kandidatenstrings in kandidatenListe,
	 *  die von diesem Thread Ã¼berprÃ¼ft werden
	 */
	protected int schrittweite;
	
	/*
	 * wird nur dann auf True gesetzt, wenn dieser Thread einen Kandidatenstring
	 * gefunden hat, der den gesuchten Hash erzeugt.
	 */
	protected boolean lösungGefunden = false;
	
	/*
	 * wenn ein Kandidatenstring gefunden wurde, der den gesuchten Hash erzeugt,
	 * soll er hier abrufbar sein.
	 */
	protected String lösung = null;
	
	/*
	 * enthÃ¤lt den gesuchten Hash
	 */
	protected String gesuchterHash = null;

	public boolean isLösungGefunden() {
		return lösungGefunden;
	}
	public String getLösung() {
		return lösung;
	}
	
	public abstract void run();

}
