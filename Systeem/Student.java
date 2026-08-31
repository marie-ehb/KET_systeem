package Systeem;
/**
* @author Marie Scraeyen
* @version 1.1
*/

import java.util.HashMap;

public class Student extends Gebruiker{
    HashMap < String, String > koppelingBedrijven = new HashMap <>();
    
    /**
    * @param bedrijf het bedrijf dat toegevoegd wordt
    * @param evenement het type evenement (stage, gastles, lezing)
    */
    @Override
    public void voegBedrijfToe(String bedrijf, String evenement)
    {
        if (Registratie.isIngelogd()) {
        if (evenement == "stage") {
            this.koppelingBedrijven.put(bedrijf, evenement);
        } else {
            throw new Error("Student kan enkel stage toevoegen!");
        }            
        } else {
            throw new Error("Niet ingelogd.");
        }

    }

    /**
    * @return een String met een lijst van bedrijven en evenementen
    */
    @Override 
    public String toString()
    {
        String output = "";
        for (String bedrijf: koppelingBedrijven.keySet()) {
            String key = bedrijf.toString();
            String value = koppelingBedrijven.get(bedrijf).toString();
            output += key + " " + value + "\n";
        }
        return output;
    }

    /**
    * @param bedrijf De bedrijf die wordt ingevoerd
    * @return Een String van zoekresutaten
    */
    @Override
    public String zoeken(Bedrijf bedrijf)
    {
        if (Registratie.isIngelogd()) {
        String zoekResultaten = 
        "Contactpersoon: " + bedrijf.getContactpersoon()
        + "Email: " + bedrijf.getEmail()
        + "Adres: " + bedrijf.getAdres()
        + "Omschrijving: " + bedrijf.getOmschrijving();
        Registratie.voegZoekResultatenToe(zoekResultaten);
        return zoekResultaten;            
        } else {
            throw new Error("Niet ingelogd.");
            
        }

    }
}
