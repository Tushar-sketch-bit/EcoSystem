package core.AnimalTypes;
import core.*;
import core.actions.CanDo.*;
public abstract class Insect extends Animal implements CanHunt.hardHunt{
   public Insect(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
