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
