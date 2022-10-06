package abstractfactoryautos;

/**
 *
 * @author brayan
 */
public class NonLuxuryCar implements Car{
    private String name;
    
    public NonLuxuryCar(String name){
        this.name=name;
    }
    
    public String getCarName(){
        return name;
    }
    
    public String getCarFeatures(){
        return "Non_luxury Car Features ";
    }
}
