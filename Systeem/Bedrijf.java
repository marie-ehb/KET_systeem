package Systeem;
/**
* @author Marie Scraeyen
* @version 1.0
*/
public class Bedrijf {
    private String contactpersoon, email, telefoonNummer, adres, omschrijving;
    private Boolean isStageBedrijf;

    public Bedrijf(String contactpersoon, String email, String telefoonNummer, String adres, String omschrijving, Boolean isStageBedrijf)
    {
        this.contactpersoon = contactpersoon;
        this.email = email;
        this.telefoonNummer = telefoonNummer;
        this.adres = adres;
        this.omschrijving = omschrijving;
        this.isStageBedrijf = isStageBedrijf; 
    }

    public void setContactpersoon(String contactpersoon){ this.contactpersoon = contactpersoon;}
    public String getContactpersoon(){ return this.contactpersoon; }
    public void setEmail(String email){ this.email = email;}
    public String getEmail(){ return this.email; }
    private String getTelefoonNummer(){ return this.telefoonNummer; }
    private Boolean getStageBedrijf(){ return this.isStageBedrijf; }
    public void setAdres(String adres){ this.adres = adres;}
    public String getAdres(){ return this.adres; }
    public void setOmschrijving(String omschrijving){ this.omschrijving = omschrijving;}
    public String getOmschrijving(){ return this.omschrijving; }

    /**
    * @return slaat zoekresultaten op en voegt ze toe.
    */
    public String zoekResultaten()
    {
        String zoekResultaten = "Contactpersoon: " + this.getContactpersoon()
        + "Email: " + this.getEmail()
        + "Adres: " + this.getAdres()
        + "Omschrijving: " + this.getOmschrijving()
        + "TelefoonNummer: " + this.getTelefoonNummer()
        + "Stagebedrijf: " + this.getStageBedrijf().toString();
        Registratie.voegZoekResultatenToe(zoekResultaten);
        return zoekResultaten;
    }
}
