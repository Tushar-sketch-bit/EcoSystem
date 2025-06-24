package core.AnimalTypes;
import core.actions.CanDo.*;
import core.SpeciesType.Animal;
import core.TraitsType.PhysicalTraits;
import core.TraitsType.TechnicalTraits;
public abstract class Mammal extends Animal implements CanHunt.fierceHunt{
   public Mammal(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
