package core;

import core.actions.CanDo.*;

public abstract class Species<T> implements Movable,Soundable{
    private String name;
    private T traits;
  public Species(String name,T traits){
        this.name=name;
        this.traits=traits;
    }
    public String getName() {
        return name;
    }
    public T getTraits() {
        return traits;
    }
   public abstract void SpeciesInfo();
}
