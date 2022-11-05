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
public class communityhistory {
    public ArrayList<community> history;   
    
    public communityhistory() {
        this.history = new ArrayList<community>();
    }
    
    public ArrayList<community> getHistory(){
        return history;
    }
    
    public void setHistory(ArrayList<community> history){
        this.history = history; 
    }
    
    public community addNewDetail(){
        community newDetail = new community();
        history.add(newDetail); 
        return newDetail;
    }
    
    public void deleteDetails(community ed){
        history.remove(ed);
    }
        
        
    }

   
              
   
    
     
