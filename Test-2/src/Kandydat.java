public class Kandydat implements Cloneable, Comparable<Kandydat>
{
    private String nazwa;
    private int wiek;
    private String wyksztalcony;
    private int latadoswiadczenia;


    public Kandydat(String nazwa, int wiek, String wyksztalcony, int latadoswiadczenia)
    {
        this.nazwa = nazwa;
        this.wiek = wiek;
        this.wyksztalcony = wyksztalcony;
        this.latadoswiadczenia = latadoswiadczenia;
    }


    public String getNazwa()
    {
        return this.nazwa;
    }

    public int getWiek()
    {
        return this.wiek;
    }

    public String getWyksztalcony()
    {
        return this.wyksztalcony;
    }

    public int getLatadoswiadczenia()
    {
        return this.latadoswiadczenia;
    }

    @Override
    public int compareTo(Kandydat o)
    {
        int result = wyksztalcony.compareTo(o.wyksztalcony);
        if (result == 0) {
            result = Integer.compare(this.wiek, o.wiek);
            if (result == 0)
            {
                result = Integer.compare(this.latadoswiadczenia, o.latadoswiadczenia);
            }
        }
        return result;
    }

    @Override
    public Kandydat clone() {
        try {
            Kandydat clone = (Kandydat) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Kandydat{" +
                "nazwa='" + this.nazwa + '\'' +
                ", wiek=" + this.wiek +
                ", wyksztalcony='" + this.wyksztalcony + '\'' +
                ", latadoswiadczenia=" + this.latadoswiadczenia +
                '}';
    }
}