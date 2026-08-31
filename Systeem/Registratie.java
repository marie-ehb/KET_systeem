package Systeem;
import java.util.ArrayList;
/**
* @author Marie Scraeyen
* @version 1.2
*/

public class Registratie {
    private static Boolean ingelogd = false;
    private static ArrayList < String > zoekResultaten = new ArrayList<>();
    private static Boolean admin = false;

    public static void inloggen(){
        ingelogd = true;
    }

    public static void uitloggen(){
        ingelogd = false;
        admin = false;
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

    public static void maakAdmin()
    {
        admin = true;
    }

    /**
    * @return of de gebruiker administratieve rechten heeft 
    */
    public static Boolean isAdmin()
    {
        return admin;
    }
}
