package core.AnimalCollection;
import core.*;
import core.AnimalTypes.Mammal;

 public class Lion extends Mammal {
   public Lion(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
    @Override
   public void hunt(String name) {
        System.out.println(name+" is hunting brutally");
    }
}
