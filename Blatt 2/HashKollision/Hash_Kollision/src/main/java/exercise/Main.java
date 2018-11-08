package exercise;

import main.AMain;
import main.Kandidatengenerator;

public class Main extends AMain {

	public static void main(String[] args) {

		String[] candidateStrings = Kandidatengenerator.generiereSequenzKElemente(erlaubteZeichen, kSequenzLÃ¤nge);
		System.out.println("Die Länge des String-Arrays beträgt: " + candidateStrings.length);
	}

}
