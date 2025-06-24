package core;

 public abstract class Human extends Species<TechnicalTraits<Integer>>{
    private PhysicalTraits traits2;
   public Human(String name,TechnicalTraits<Integer> traits,PhysicalTraits traits2){
        super(name,traits);
        this.traits2=traits2;
    }

    public void SpeciesInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Strength: "+getTraits().strength);
        System.out.println("Speed: "+getTraits().speed);
        System.out.println("Intelligence: "+getTraits().intelligence);
        System.out.println("Agility: "+getTraits().agility);
        System.out.println("Physical Features: "+traits2);
        
    }
}
