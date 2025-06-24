package core.AnimalTypes;
import core.Animal;
import core.actions.CanDo.*;
import core.*;
public abstract class Mammal extends Animal implements CanHunt.fierceHunt{
   public Mammal(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
