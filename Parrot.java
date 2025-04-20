public class Parrot extends Bird {

    public Parrot(String name, int age, String color, Owner owner) {
        super(name, age, color, owner);  
    }

    public Parrot(String name, int age, String color) {
        super(name, age, color);  
    }

    public void eat() {
        System.out.println(name + " is eating fruits.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping in its cage.");
    }

    public void fly() {
        System.out.println(name + " is flying in the sky.");
    }

    public String toString() {
        return "Parrot's name is'" + name + "' and its age is" + age + " It is " + color + "'in color , " + (owner != null ? owner : "No owner") ;
      //Checks if there is an owner or not
    }
}
