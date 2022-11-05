/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author harsh
 */
public class doctor {
    public String Patient_Name; 
    public String Vital_Sign;
    public String Encounter;




    public String getPatient_Name() {
        return Patient_Name;
    }

    public void setPatient_Name(String Patient_Name) {
        this.Patient_Name = Patient_Name;
    }

    public String getVital_Sign() {
        return Vital_Sign;
    }

    public void setVital_Sign( String Vital_Sign ) {
        this.Vital_Sign = Vital_Sign;
    }

    public String getEncounter() {
        return Encounter;
    }

    public void setEncounter(String Encounter) {
        this.Encounter = Encounter;
    }


    
    @Override
    public String toString(){
        return Patient_Name;
    }
    
    
}
