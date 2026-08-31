package Systeem;
import java.util.ArrayList;
/**
* @author Marie Scraeyen
* @version 1.1
*/

public class Registratie {
    private static Boolean ingelogd = false;
    private static ArrayList < String > zoekResultaten = new ArrayList<>();

    public static void inloggen(){
        ingelogd = true;
    }

    public static void uitloggen(){
        ingelogd = false;
        zoekResultaten.clear();
    }

    /**
    * @return of de gebruiker is ingelogd 
    */
    public static Boolean isIngelogd()
    {
        return ingelogd;
    }

    /**
    * @return de zoekresutaten van het bedrijf 
    */
    public static ArrayList <String> getZoekResultaten()
    {
        return zoekResultaten;
    }

    /**
    * @param zoekResultaat De zoekresultaat die worden toegevoegd
    */
    public static void voegZoekResultatenToe(String zoekResultaat)
    {
        zoekResultaten.add(zoekResultaat);
    }
}
