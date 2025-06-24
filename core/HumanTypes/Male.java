package core.HumanTypes;
import core.SpeciesType.Human;
import core.TraitsType.*;

abstract class Male extends Human{
    Male(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
