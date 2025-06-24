package core.AnimalCollection;

import core.AnimalTypes.Mammal;
import core.TraitsType.PhysicalTraits;
import core.TraitsType.TechnicalTraits;

 public class Lion extends Mammal {
   public Lion(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
    @Override
   public void hunt(String name) {
        System.out.println(name+" is hunting brutally");
    }
}
