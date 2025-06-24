package simulation;
import java.util.ArrayList;
import core.AnimalCollection.*;
import core.TraitsType.*;


public class AnimalInitializer {
    public static Lion createLion(ArrayList<String> Physicalfeatures,Integer Strength,Integer Speed,Integer Intelligence,Integer Agility){ 
        TechnicalTraits<Integer> lionTechTraits = new GeneralTechnicalTraits<>(Strength, Speed, Intelligence, Agility);
        PhysicalTraits lionPhysical = new GeneralPhysicalTraits(Physicalfeatures);
        return new Lion("Lion", lionTechTraits, lionPhysical);
    }
}
