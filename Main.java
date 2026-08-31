/**
* @author Marie Scraeyen
* @version 1.0
*/

import Systeem.Docent;
import Systeem.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Docent d1 = new Docent();

        d1.voegBedrijfToe("Zalando", "Gastles");
        d1.voegBedrijfToe("Coca Cola", "Stage");
        s1.voegBedrijfToe("Spa", "Stage");

        System.out.println(d1);
        System.out.println(s1);
    }
}
