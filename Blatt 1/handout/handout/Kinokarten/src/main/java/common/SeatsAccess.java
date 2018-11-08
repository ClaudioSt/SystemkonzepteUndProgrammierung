package common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SeatsAccess
{

    public static int getSeat(String filename, int seat)
    {
        try
        {
            FileReader fileReader = new FileReader(new File(filename));
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null)
            {
                int i = Integer.valueOf(line.split(" ")[0]);
                if (i == seat)
                {
                    br.close();
                    return Integer.valueOf(line.split(" ")[1]);
                }
            }
            br.close();
        } catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return -1;
    }

    private static List<Integer> loadSeats(String filename)
    {
        List<Integer> s = new ArrayList<Integer>();
        try
        {
            FileReader fileReader = new FileReader(new File(filename));
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            while ((line = br.readLine()) != null)
            {
                int reserved = Integer.valueOf(line.split(" ")[1]);
                s.add(reserved);
            }
            br.close();
        } catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return s;
    }

    public static void writeSeat(String filename, int seat, int value)
    {
        List<Integer> seats = SeatsAccess.loadSeats(filename);
        if (seats != null && seats.size() >= seat)
        {
            seats.set(seat, value);
            SeatsAccess.writeSeats(filename, seats);
        }
    }

    public static void writeSeats(String filename, List<Integer> s)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filename)));
            for (int i = 0; i < s.size(); i++)
            {
                bw.write(i + " " + s.get(i) + "\n");
            }
            bw.close();
        } catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
