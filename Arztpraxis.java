import java.util.ArrayList;
/**
 * Klasse zur Darstellung einer Arztpraxis mit einem Kinderarzt und zwei Allgemeinärzten
 */
public class Arztpraxis{
    private String name; 
    private ArrayList<Patient> kinderarzt;
    private ArrayList<Patient> arzt1;
    private ArrayList<Patient> arzt2;

    
    public Arztpraxis(){
        name = "Zuse-Praxis"; 
        kinderarzt = new ArrayList<Patient>();
        arzt1 = new ArrayList<Patient>();
        arzt2 = new ArrayList<Patient>();
    }
}
