import java.util.ArrayList;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Kandydat Kandydat = new Kandydat("Arek", 21, "magister", 1);
        ArrayList<Kandydat> grupa = new ArrayList<Kandydat>(Arrays.asList(
                Kandydat,
                new Kandydat("Tomek", 20, "licencjant", 1),
                new Kandydat("Łucja", 21, "magiser", 6),
                new Kandydat("Sebastian", 124, "magister", 9),
                new Kandydat("Matthew", 23, "magiser", 1),
                new Kandydat("Artur", 23, "magister", 1)
        ));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);

        System.out.println("--------");
        Rekrutacja.setDoswiadczenie();
        System.out.println(Qualified(Kandydat));
        System.out.println(RecruitmentMap(grupa));
    }

    public static boolean Qualified(Kandydat k)
    {
        return k.getLatadoswiadczenia() >= Rekrutacja.doswiadczenie;
    }

    public static HashMap<Integer, String> RecruitmentMap(ArrayList<Kandydat> klist)
    {
        HashMap<Integer, String> result = new HashMap<Integer, String>();

        for(Kandydat osoba : klist)
        {
            if(Qualified(osoba))
            {
                result.put(osoba.getLatadoswiadczenia(), osoba.getNazwa());
            }
        }
        return result;
    }
}