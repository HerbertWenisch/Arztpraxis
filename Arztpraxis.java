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
    
    public void anmelden(Patient p){
        if(p.nenneAlter() < 18) kinderarzt.add(p);
        else if (arzt1.size() < arzt2.size()) arzt1.add(p);
             else arzt2.add(p);
    }
}
