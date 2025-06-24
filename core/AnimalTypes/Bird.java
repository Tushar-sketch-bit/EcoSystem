package core.AnimalTypes;
import core.SpeciesType.Animal;
import core.TraitsType.PhysicalTraits;
import core.TraitsType.TechnicalTraits;
import core.actions.CanDo.*;
abstract class Bird extends Animal implements CanHunt.MayHunt{
    Bird(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
