package core.AnimalTypes;

import core.SpeciesType.Animal;
import core.TraitsType.PhysicalTraits;
import core.TraitsType.TechnicalTraits;
import core.actions.CanDo.*;

abstract class Fish extends Animal implements CanHunt.CannotHunt{
    Fish(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
        }
 }
