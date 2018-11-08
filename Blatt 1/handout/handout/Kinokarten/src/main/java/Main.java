import common.SeatsAccess;

public class Main {

	private static String seatsFilename = "seats.dat";
	private static int n = 100; // the number of seats

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int reserved = 0;
		while (reserve()) {
			reserved++;
		}
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Kartenschalter: " + reserved + " Karten verkauft");
		System.out.println("Benoetigte Zeit: " + totalTime + " ms");
	}

	private static boolean reserve() {
		boolean seatReserved = false;

		// TODO: Iterieren Sie über alle Sitze des Kinos (n), geben Sie true zurück,
		// sobald Sie einen freien Sitz gefunden haben

		for (int i = 0; i < n; i++) {
			seatReserved = reserveSeat(i);
			if (seatReserved) {
				return seatReserved;
			}

		}

		/*
		 * ############# # DEIN CODE # #############
		 */

		System.out.println("Seat could not be reserved!");
		return false;
	}

	public static boolean reserveSeat(int seat) {
		boolean freeSeat = false;

		// TODO: Prüfen Sie ob der Sitz belegt ist (1) oder nicht (0)
		// Verwenden Sie zum Auslesen des Sitzes i, folgenden Aufruf:
		// SeatsAccess.getSeat(seatsFilename, i)
		/*
		 * ############# # DEIN CODE # #############
		 */

		if (SeatsAccess.getSeat(seatsFilename, seat) == 0)
			freeSeat = true;

		if (freeSeat) {
			SeatsAccess.writeSeat(seatsFilename, seat, 1);
			System.out.println("Seat " + seat + " reserved!");
		}

		return freeSeat;

	}
}
