package Gebruikers;
/**
* @author Marie Scraeyen
* @version 1.1
*/

public class Administratie{
    /**
    * @param x
    * @return een String met een lijst van bedrijven en evenementen
    */
    public String gegevensOpvragen(Bedrijf bedrijf)
    {
        return "Contactpersoon: " + bedrijf.getContactpersoon()
        + "Email: " + bedrijf.getEmail()
        + "Adres: " + bedrijf.getAdres()
        + "Omschrijving: " + bedrijf.getOmschrijving();
    }

    /**
    * @param x
    */
    public void gegevensUpdaten(Bedrijf bedrijf, String categorie, String data)
    {
        switch (categorie) {
            case "contactpersoon":
                bedrijf.setContactpersoon(data);
                break;
            case "email":
                bedrijf.setEmail(data);
                break;
            case "adres":
                bedrijf.setAdres(data);
                break;
            case "omschrijving":
                bedrijf.setOmschrijving(data);
                break;
                                                    
            default:
                System.out.println("Geen geldige categorie! Voer opnieuw in.");
                break;
        }
    }
}
