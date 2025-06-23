package core.actions;
public class CanDo{
public interface Movable {
          //all methods in interfaces are by default public and abstract
        //unless marked default and static 
        //default is used to provide a default implementation for the method
         default void move(String name){
            System.out.println("Moving "+name);
         }
  interface FastMoving extends Movable{
    default void move(String name){
        System.out.println(name+" is moving fast");
          }
       }
  interface SlowMoving extends Movable{
    default void move(String name){
        System.out.println(name+" is moving slow");
         }
       }
       
    }
  
public interface Soundable{
    default void makeSound(String name){
        System.out.println(name+" is making sound");
    }   
    interface Loud extends Soundable{
        default void makeSound(String name){
            System.out.println(name+" is making loud sound");
        }
    }
    interface Silent extends Soundable{
        default void makeSound(String name){
            System.out.println(name+" is silent");
        }
    } 
     interface Quiet extends Soundable{
       default void makeSound(String name){
         System.out.println(name+" is making quiet sound");
       }
    }
  interface Whistling extends Soundable{
    default void makeSound(String name) {
        System.out.println(name+" is whistling");
       }
    }
     interface Noisy extends Soundable{
    default void makeSound(String name) {
        System.out.println(name+" is making noisy sound");
       }
    }
 }
 
 public interface CanFly{
    default void fly(String name){
        System.out.println(name+" is flying");
    }
     interface FastFlying extends CanFly{
        default void fly(String name){
            System.out.println(name+" is flying fast");
        }
    }
    interface SlowFlying extends CanFly{
        default void fly(String name){
            System.out.println(name+" is flying slow");
        }
    }
     interface Glide extends CanFly{
        default void fly(String name){
        System.out.println(name+" is gliding");
    }
        
    }

    
}

public interface CanHunt{
    default void hunt(String name){
        System.out.println(name+" is hunting");
    }

     interface fierceHunt extends CanHunt{
        default void hunt(String name){
            System.out.println(name+" hunts fiercely");
        }
    }
     interface softHunt extends CanHunt{
        default void hunt(String name){
            System.out.println(name+" hunts softly");
        }
    }
    interface hardHunt extends CanHunt{
        default void hunt(String name){
            System.out.println(name+" hunts hard");
        }
    }
     interface CannotHunt extends CanHunt{
        default void hunt(String name){
            System.out.println(name+" cannot hunt");
        }
        
    }

}

public interface CanSwim{
    default void swim(String name){
        System.out.println(name+" is swimming");
    }
    interface Swiftly extends CanSwim{
        default void swim(String name){
            System.out.println(name+" swims swiftly");
        }
    }
    interface Slowly extends CanSwim{
        default void swim(String name){
            System.out.println(name+" swims slowly");
        }
    }


  }






}