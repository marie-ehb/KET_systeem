import java.io.FileWriter;
import java.io.IOException;

import Gebruikers.Administratie;
import Gebruikers.Bedrijf;
import Gebruikers.Docent;
import Gebruikers.Student;
/**
* @author Marie Scraeyen
* @version 1.0
*/

public class Menu {
    public static void inloggen(Object gebruiker, Registratie registratie){
            registratie.inloggen();
    }

    public static String controleLogIn(Object gebruiker, Registratie registratie){
        if (registratie.isIngelogd()) {
           if (gebruiker instanceof Student) {
            return "Je bent ingelogd als student.";
            }
            else if (gebruiker instanceof Docent)
            {
                return "Je bent ingelogd als docent.";
            }
            else if (gebruiker instanceof Administratie)
            {
                return "Je bent ingelogd als administratie.";
            }
            else
            {
                return "Geen geldige gebruiker.";
            } 
        } else {
            return "Je bent niet ingelogd.";
        } 
      
    }
    public static void afsluiten(Registratie registratie)
    {
        registratie.uitloggen(); 
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }

    }
    public static void afdrukken(String zoekResultaten)
    {
        try (FileWriter output = new FileWriter("bestand.txt")) {
            output.write(zoekResultaten);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void gegevensAanpassen(Boolean isAdmin, Bedrijf bedrijf, String categorie, String data)
    {
        if (isAdmin) {
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
        } else {
            System.err.println("Geen rechten op wijziging gegevens.");
        }

    }
}
