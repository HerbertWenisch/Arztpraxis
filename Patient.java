/**
 * Klasse zur Darstellung eines Patienten mit Name und Alter
 */
public class Patient{
    private String name; 
    private int alter;
    
    public Patient(String name, int alter) {
        this.name = name; 
        this.alter = alter; 
    }
    
    public int nenneAlter(){
        return alter; 
    }
}
