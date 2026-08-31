package Systeem;
/**
* @author Marie Scraeyen
* @version 1.3
*/

public class Administratie{
    /**
    * @param bedrijf Een gegeven bedrijf
    * @return een String met een lijst van bedrijven en evenementen
    */
    public String gegevensOpvragen(Bedrijf bedrijf)
    {
        if (Registratie.isIngelogd()) {
        return "Contactpersoon: " + bedrijf.getContactpersoon()
        + "Email: " + bedrijf.getEmail()
        + "Adres: " + bedrijf.getAdres()
        + "Omschrijving: " + bedrijf.getOmschrijving();            
        } else {
            throw new Error("Niet ingelogd.");
        }

        
    }

    /**
    * @param bedrijf Een gegeven bedrijf
    * @param categorie De categorie gegevens die je wil updaten
    * @param data De data die je wil invoeren in de gegevens
    */
    public void gegevensUpdaten(Bedrijf bedrijf, String categorie, String data)
    {
        if (Registratie.isIngelogd()) {
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
                throw new Error("Geen geldige categorie! Voer opnieuw in.");
        }            
        } else {
            throw new Error("Niet ingelogd.");
        }
    }
}
