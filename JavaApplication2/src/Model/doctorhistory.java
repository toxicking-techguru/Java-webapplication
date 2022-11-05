/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class doctorhistory {
    public ArrayList<doctor> history;   
    
    public doctorhistory() {
        this.history = new ArrayList<doctor>();
    }
    
    public ArrayList<doctor> getHistory(){
        return history;
    }
    
    public void setHistory(ArrayList<doctor> history){
        this.history = history; 
    }
    
    public doctor addNewDetail(){
        doctor newDetail = new doctor();
        history.add(newDetail); 
        return newDetail;
    }
    
    public void deleteDetails(doctor ed){
        history.remove(ed);
    }
        
        
    }

   
              
   
    
     
