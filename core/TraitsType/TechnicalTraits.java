package core.TraitsType;

 public abstract class TechnicalTraits<T extends Number> {
   public T strength;
   public T speed;
   public T intelligence;
   public T agility;
  public TechnicalTraits(T strength,T speed,T intelligence,T agility){
        this.strength=strength;
        this.speed=speed;
        this.intelligence=intelligence;
        this.agility=agility;
    }


   // public static void main(String[] args) {
     //   TechnicalTraits<Integer> lionTechTraits = new TechnicalTraits<>(90, 70, 60, 75);
    //}
}
