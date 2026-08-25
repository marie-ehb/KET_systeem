package Gebruikers;
/**
* @author Marie Scraeyen
* @version 1.0
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
        koppelingBedrijven.put(bedrijf, evenement);
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
}
