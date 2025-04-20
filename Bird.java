public abstract class Bird extends Animal {

    public Bird(String name, int age, String color, Owner owner) {
        super(name, age, color, owner);  
    }

    public Bird(String name, int age, String color) {
        super(name, age, color);  
    }

    public void eat() {
        System.out.println(name + " is eating seeds.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping on a branch.");
    }

    public abstract void fly();

    public String toString() {
        return "Bird's name is'" + name + "' and its age is" + age + " It is " + color + "'in color," + (owner != null ? owner : "No owner") ;
      //Checks if there is an owner or not
    }
}
