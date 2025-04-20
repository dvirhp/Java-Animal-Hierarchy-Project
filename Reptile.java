public abstract class Reptile extends Animal {

    public Reptile(String name, int age, String color) {
        super(name, age, color);  
    }

    public void eat() {
        System.out.println(name + " is eating insects.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping in a warm place.");
    }

    public abstract void crawl();

    public String toString() {
        return "Reptile's name is'" + name + "', and its age is " + age + ", It is " + color +"in color";
      //no owner
    }
}
