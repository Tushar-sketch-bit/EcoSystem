package core.TraitsType;
import java.util.ArrayList;

public abstract class PhysicalTraits{
    
    ArrayList<String> Physicalfeatures=new ArrayList<>();
   public PhysicalTraits(ArrayList<String> Physicalfeatures){
       this.Physicalfeatures=Physicalfeatures;
    }
    public ArrayList<String> getPhysicalfeatures(){
        return Physicalfeatures;
    }
}
