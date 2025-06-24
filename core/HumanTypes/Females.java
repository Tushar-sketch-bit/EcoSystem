package core.HumanTypes;
import core.SpeciesType.Human;
import core.TraitsType.*;
abstract class Females extends Human{
    Females(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
