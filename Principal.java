class Animal { // Superclass (parent)
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }

    public String name = "Animal";
  }
  
  class Dog extends Animal { // Subclass (child)
    
    public void animalSound() {
      super.animalSound(); // Call the superclass method
      System.out.println("The dog says: bow wow");
    }
      public String name = "Dog";
  
      public void printName() {
          System.out.println("My name is " + super.name); // Accede a la variable name de la clase Animal
      }
    }
  
  
  public class Principal {
     public static void main(String[] args) {
        Animal myDog = new Dog(); // Create a Dog object
        myDog.animalSound(); // Call the method on the Dog object
        ((Dog) myDog).printName(); // Cast myDog to Dog to call the method
     }
  }
