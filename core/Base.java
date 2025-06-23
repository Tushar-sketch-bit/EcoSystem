package core;

import core.actions.CanDo.*;


abstract class Species<T> implements Movable,Soundable{
    private String name;
    private T traits;
    Species(String name,T traits){
        this.name=name;
        this.traits=traits;
    }
    public String getName() {
        return name;
    }
    public T getTraits() {
        return traits;
    }
    abstract void SpeciesInfo();
}

class TechnicalTraits<T>{
    T strength;
    T speed;
    T intelligence;
    T agility;
    TechnicalTraits(T strength,T speed,T intelligence,T agility){
        this.strength=strength;
        this.speed=speed;
        this.intelligence=intelligence;
        this.agility=agility;
    }
}

class PhysicalTraits{
    String color;
    String skintype;
    String patterns;
    PhysicalTraits(String color,String skintype, String patterns){
        this.color=color;
        this.skintype=skintype;
        this.patterns=patterns;
    }
}

abstract class Animal extends Species<TechnicalTraits<Integer>> implements CanHunt,CanFly,CanSwim{
    private PhysicalTraits traits2;
    Animal(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits);
        this.traits2=traits2;
    }

   public void SpeciesInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Strength: "+getTraits().strength);
        System.out.println("Speed: "+getTraits().speed);
        System.out.println("Intelligence: "+getTraits().intelligence);
        System.out.println("Agility: "+getTraits().agility);
        System.out.println("Color: "+traits2.color);
        System.out.println("Skin Type: "+traits2.skintype);
        System.out.println("Patterns: "+traits2.patterns);
    }
}
abstract class Mammal extends Animal implements CanHunt.fierceHunt{
    Mammal(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
abstract class Reptile extends Animal implements CanHunt.softHunt{
    Reptile(String name ,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
abstract class Insect extends Animal implements CanHunt.hardHunt{
    Insect(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
abstract class Bird extends Animal{
    Bird(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}

abstract class Fish extends Animal implements CanHunt.CannotHunt{
    Fish(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
     }

class Lion extends Mammal{
    Lion(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}

class  Tiger extends Mammal{
    Tiger(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}

class Cheetah extends Mammal{
    Cheetah(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}











abstract class Human extends Species<TechnicalTraits<Integer>>{
    private PhysicalTraits traits2;
    Human(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits);
        this.traits2=traits2;
    }

    public void SpeciesInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Strength: "+getTraits().strength);
        System.out.println("Speed: "+getTraits().speed);
        System.out.println("Intelligence: "+getTraits().intelligence);
        System.out.println("Agility: "+getTraits().agility);
        System.out.println("Color: "+traits2.color);
        System.out.println("Skin Type: "+traits2.skintype);
        System.out.println("Patterns: "+traits2.patterns);
    }
}


abstract class Male extends Human{
    Male(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}
abstract class Female extends Human{
    Female(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits,traits2);
    }
}

























































public class Base {

    public static void main(String[] args) {
        TechnicalTraits<Integer> lionTechTraits = new TechnicalTraits<>(90, 70, 60, 75);

        // Step 2: Create physical traits
        PhysicalTraits lionPhysical = new PhysicalTraits("Golden", "Fur", "Striped");

        // Step 3: Create Animal object
        Lion lion = new Lion("Lion", lionTechTraits, lionPhysical);

        // Step 4: Call method
        lion.SpeciesInfo();
    }
    
}
