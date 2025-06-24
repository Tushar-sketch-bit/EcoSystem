package core;

import java.util.ArrayList;
import simulation.*;
import core.AnimalCollection.*;

public class Base {
    public static void main(String[] args) {
        Integer strength=10,Speed=10,Intelligence=10,Agility=10;
        ArrayList<String> Physicalfeatures=new ArrayList<String>();
        Physicalfeatures.add("Long Body");
        Physicalfeatures.add("Long Legs");
        Physicalfeatures.add("long Beard");
        
        Lion lion=AnimalInitializer.createLion(Physicalfeatures,strength,Speed,Intelligence,Agility);
        lion.hunt("Lion");
        lion.SpeciesInfo();
    }
    
}
