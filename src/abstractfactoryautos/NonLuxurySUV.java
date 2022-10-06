package abstractfactoryautos;

/**
 *
 * @author brayan
 */
public class NonLuxurySUV implements SUV{
    private String name;
    
    public NonLuxurySUV(String name){
        this.name=name;
    }
    
    public String getSUVName(){
        return name;
    }
    
    public String getSUVFeatures(){
        return "Non-Luxury SUV Features";
    }
}
