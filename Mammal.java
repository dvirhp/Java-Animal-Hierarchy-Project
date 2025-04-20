public abstract class Mammal extends Animal {

    public Mammal(String name, int age, String color, Owner owner) {
        super(name, age, color, owner); 
    }

    public Mammal(String name, int age, String color) {
        super(name, age, color); 
    }
    
    public void eat() {
        System.out.println(name + " is eating food.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public String toString() {
        return "Mammal's name is'" + name + "' and its age is" + age + " It is " + color + "'in color ," + (owner != null ? owner : "No owner") ;
        //Checks if there is an owner or not
    }
}
