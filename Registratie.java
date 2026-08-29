import java.util.ArrayList;
/**
* @author Marie Scraeyen
* @version 1.0
*/

public class Registratie {
    private Boolean ingelogd = false;
    ArrayList < String > zoekresultaten = new ArrayList<>();

    public void inloggen(){
        this.ingelogd = true;
    }

    public void uitloggen(){
        this.ingelogd = false;
    }

    public Boolean isIngelogd()
    {
        return this.ingelogd;
    }
}
