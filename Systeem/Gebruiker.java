package Systeem;
/**
* @author Marie Scraeyen
* @version 1.1
*/

public abstract class Gebruiker {
    public abstract void voegBedrijfToe(String bedrijf, String evenement);
    public abstract String zoeken(Bedrijf bedrijf);
}
