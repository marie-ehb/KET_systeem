package Gebruikers;
/**
* @author Marie Scraeyen
* @version 1.0
*/
public class Bedrijf {
    private String contactpersoon, email, telefoonNummer, adres, omschrijving;

    public Bedrijf(String contactpersoon, String email, String telefoonNummer, String adres, String omschrijving)
    {
        this.contactpersoon = contactpersoon;
        this.email = email;
        this.telefoonNummer = telefoonNummer;
        this.adres = adres;
        this.omschrijving = omschrijving;
    }

    public void setContactpersoon(String contactpersoon){ this.contactpersoon = contactpersoon;}
    public String getContactpersoon(){ return this.contactpersoon; }
    public void setEmail(String email){ this.email = email;}
    public String getEmail(){ return this.email; }
    private void setTelefoonNummer(String telefoonNummer){ this.telefoonNummer = telefoonNummer;}
    private String getTelefoonNummer(){ return this.telefoonNummer; }
    public void setAdres(String adres){ this.adres = adres;}
    public String getAdres(){ return this.adres; }
    public void setOmschrijving(String omschrijving){ this.omschrijving = omschrijving;}
    public String getOmschrijving(){ return this.omschrijving; }
}
