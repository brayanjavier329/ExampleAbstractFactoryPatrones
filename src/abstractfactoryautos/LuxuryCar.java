/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactoryautos;

/**
 *
 * @author brayan
 */
public class LuxuryCar implements Car{
    private String name;
    
    public LuxuryCar(String name){
        this.name=name;
    }
    
    public String getCarName(){
        return name;
    }
    
    public String getCarFeatures(){
        return "Luxury Car Features ";
    }
}
