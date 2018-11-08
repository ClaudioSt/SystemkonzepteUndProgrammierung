import common.SeatsAccess;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class TestMain
{
    @Rule
    public Timeout globalTimeout = Timeout.seconds(20);

    @Before
    public void initialize()
    {
        int n = 100;    // the number of seats
        SeatsAccess.writeSeats("seats.dat", initSeats(n));
    }

    private static List<Integer> initSeats(int n)
    {
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            s.add(0);
        }
        return s;
    }

    @Test
    public void reserveSingleSeat()
    {
        Main.reserveSeat(50);

        assert(SeatsAccess.getSeat("seats.dat", 50) == 1);
    }

    @Test
    public void tryReservingOccupiedSeat()
    {
        reserveSingleSeat();

        Main.reserveSeat(10);

        assert(Main.reserveSeat(10) == false);
    }

    @Test
    public void testReserveAllSeats()
    {
        for(int i=0; i < 100; i++)
        {
            Main.reserveSeat(i);
        }

        for(int i=0; i < 100; i++)
            assert(SeatsAccess.getSeat("seats.dat", i) == 1);
    }
}
