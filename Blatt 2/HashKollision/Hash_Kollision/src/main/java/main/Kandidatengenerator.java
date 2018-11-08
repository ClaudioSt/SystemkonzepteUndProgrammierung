package main;

import java.util.LinkedList;
import java.util.List;

public class Kandidatengenerator { 
	
	/**
	 * Gibt ein Array mit möglichen Kombinationen der Zeichen in
	 * erlaubteLetter mit der Länge sequenzLängeK zurück.  
	 * @param erlaubteLetter
	 * @param sequenzLängeK
	 * @return Array mit den Strings mit Zeichen aus erlaubteLetter
	 */
	public static String[] generiereSequenzKElemente(
			char[] erlaubteLetter,
			int sequenzLängeK) 
	{ 
		int nAnzahlErlaubteLetter = erlaubteLetter.length;
		List<String> ergebnisListe = new LinkedList<>();
		generiereKombinationenRekursiv(erlaubteLetter, "", nAnzahlErlaubteLetter, sequenzLängeK,ergebnisListe);
		return ergebnisListe.toArray(new String[0]);
	} 

	private static List<String> generiereKombinationenRekursiv(
			char[] erlaubteLetter,  
			String präfix,  
			int nAnzahlErlaubteLetter,
			int kAnzahlNochZuKombinieren,
			List<String> ergebnisListe) 
	{  
		if (kAnzahlNochZuKombinieren == 0)  
		{ 
			ergebnisListe.add(präfix);
			return ergebnisListe; 
		}  
		for (int i = 0; i < nAnzahlErlaubteLetter; ++i) 
		{  
			String newPrefix = präfix + erlaubteLetter[i];   
			generiereKombinationenRekursiv(erlaubteLetter, newPrefix,  
					nAnzahlErlaubteLetter, kAnzahlNochZuKombinieren - 1,ergebnisListe);  
		}
		return ergebnisListe;
	}
}
