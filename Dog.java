public class Dog extends Mammal {

    public Dog(String name, int age, String color, Owner owner) {
        super(name, age, color, owner);  
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);  
    }

    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping in its bed.");
    }

    public String toString() {
        return "Dog's name is'" + name + "' and its age is" + age + " It is " + color + "'in color ," + (owner != null ? owner : "No owner");
      //Checks if there is an owner or not
    }
}
