import common.SeatsAccess;

import java.util.ArrayList;
import java.util.List;

public class ResetSeats
{

    /**
     * Resets all the seats in the file "seats.dat" to 0.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int n = 100;    // the number of seats
        SeatsAccess.writeSeats("seats.dat", initSeats(n));
    }

    private static List<Integer> initSeats(int n)
    {
        List<Integer> s = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
        {
            s.add(0);
        }
        return s;
    }

}
