package core.AnimalTypes;

import core.SpeciesType.Animal;
import core.TraitsType.PhysicalTraits;
import core.TraitsType.TechnicalTraits;
import core.actions.CanDo.*;

public abstract class Reptile extends Animal implements CanHunt.softHunt{
 public Reptile(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
