package exercise;

import main.AMain;
import main.Kandidatengenerator;

public class Main extends AMain {

	public static void main(String[] args) {

		String[] candidateStrings = Kandidatengenerator.generiereSequenzKElemente(erlaubteZeichen, kSequenzLänge);
		System.out.println("Die L�nge des String-Arrays betr�gt: " + candidateStrings.length);
	}

}
