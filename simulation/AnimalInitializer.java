package simulation;
import java.util.ArrayList;
import core.AnimalTypes.*;
import core.TraitsType.*;
import simulation.Labeling.Labels;
import core.SpeciesType.*;

public class AnimalInitializer {
    

   // public static Lion createLion(ArrayList<String> Physicalfeatures,Integer Strength,Integer Speed,Integer Intelligence,Integer Agility){ 
     //   TechnicalTraits<Integer> lionTechTraits = new GeneralTechnicalTraits<>(Strength, Speed, Intelligence, Agility);
       // PhysicalTraits lionPhysical = new GeneralPhysicalTraits(Physicalfeatures);
        //return new Lion("Lion", lionTechTraits, lionPhysical);
        public static Animal createAnimal(String type,String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
            type=type.toUpperCase();
           if(type.equals(Labels.MAMMAL)){
               return new Mammal(name,traits,traits2);
           }

        }
    }

