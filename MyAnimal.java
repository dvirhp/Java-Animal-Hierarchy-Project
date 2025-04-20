import java.util.ArrayList;

public class MyAnimal {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Shalom", "054-6667777");
        Owner owner2 = new Owner("Dvir", "050-9507992");

        Animal dog = new Dog("Alfred", 6, "Brown", owner1);
        Animal parrot = new Parrot("Nori", 10, "Yellow", owner2);
        Animal dog1 = new Dog("Whisper", 2, "White", owner1);
        Animal lizard = new Lizard("Sana", 1, "Green"); 

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(parrot);
        animals.add(dog1);
        animals.add(lizard);

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i); 

            System.out.println(animal.toString());

            animal.eat();
            animal.sleep();

            if (animal instanceof Parrot) {
                ((Parrot) animal).fly();  
            }
            
            if (animal instanceof Lizard) {
                ((Lizard) animal).crawl();  
            }

            System.out.println();
        }
        
        System.out.println("-------------------------------------------------");
        
        
        System.out.println("Original Dog: ");
        System.out.println(dog1.toString());
        System.out.println();
      
        Animal dog2 = dog1.clone();

        System.out.println("Cloned Dog: ");
        System.out.println(dog2.toString());
        System.out.println();

        dog2.getOwner().setName("Sarah");
        dog2.getOwner().setPhone("050-9876543");

        System.out.println("Cloned Dog after changing owner: ");
        System.out.println(dog2.toString());
        System.out.println();

        System.out.println("Original Dog after changing cloned owner: ");
        System.out.println(dog1.toString());
        
        
        
    }
}
