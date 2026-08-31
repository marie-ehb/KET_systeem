package Systeem;
/**
* @author Marie Scraeyen
* @version 1.1
*/

import java.util.HashMap;

public class Docent extends Gebruiker{
    HashMap < String, String > koppelingBedrijven = new HashMap <>();
    
    /**
    * @param bedrijf het bedrijf dat toegevoegd wordt
    * @param evenement het type evenement (stage, gastles, lezing)
    */
    @Override
    public void voegBedrijfToe(String bedrijf, String evenement)
    {
        if (Registratie.isIngelogd()) {
          koppelingBedrijven.put(bedrijf, evenement);
         
        } else {
            throw new Error("Niet ingelogd.");
        }
    }    

    /**
    * @param bedrijf het bedrijf dat toegevoegd wordt
    * @return de zoekresultaten van het bedrijf 
    */
    @Override
    public String zoeken(Bedrijf bedrijf)
    {
        if (Registratie.isIngelogd()) {
        return bedrijf.zoekResultaten();
            
        } else {
            throw new Error("Niet ingelogd.");
            
        }
    }
}
