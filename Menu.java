import java.io.FileWriter;
import java.io.IOException;

import Systeem.Administratie;
import Systeem.Docent;
import Systeem.Registratie;
import Systeem.Student;
/**
* @author Marie Scraeyen
* @version 1.0
*/

public class Menu {
    /**
    * @param gebruiker De gebruiker die wordt ingevoerd
    */
    public static void inloggen(Object gebruiker){
        if (gebruiker instanceof Student || gebruiker instanceof Docent || gebruiker instanceof Administratie)
        {
            Registratie.inloggen();
        }
        else
        {
            throw new Error("Geen geldige gebruiker!");
           
        }
    }

    /**
    * @param gebruiker De gebruiker die wordt ingevoerd
    * @return Of de gebruiker is ingelogd
    */
    public static String controleLogIn(Object gebruiker){
        if (Registratie.isIngelogd()) {
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
                throw new Error("Geen geldige gebruiker.");
                
            } 
        } else {
            throw new Error("Je bent niet ingelogd.");

        } 
      
    }

    public static void afsluiten()
    {
        Registratie.uitloggen(); 
        
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }

    }
    public static void afdrukken()
    {
        try (FileWriter output = new FileWriter("bestand.txt")) {
            output.write(Registratie.getZoekResultaten().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
