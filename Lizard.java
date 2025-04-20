public class Lizard extends Reptile {

    public Lizard(String name, int age, String color) {
        super(name, age, color); 
    }

    public void eat() {
        System.out.println(name + " is eating small insects.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping under a rock.");
    }

    public void crawl() {
        System.out.println(name + " is crawling on the ground.");
    }

    public String toString() {
        return "Lizard's name is'" + name + "', and its age is" + age + ", It is " + color +"in color";
        //no owner
    }
}
