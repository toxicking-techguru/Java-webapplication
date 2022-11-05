/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harsh
 */
public class community {
    public String Username; 
    public String City;
    public String Community;
    public String House;




    public String getPatient_Name() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getVital_Sign() {
        return City;
    }

    public void setVital_Sign( String Vital_Sign ) {
        this.City = Vital_Sign;
    }

    public String getEncounter() {
        return Community;
    }

    public void setEncounter(String Encounter) {
        this.Community = Encounter;
    }


    
    @Override
    public String toString(){
        return Username;
    }
    
    
}
