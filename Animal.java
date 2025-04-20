import java.util.Objects;

public abstract class Animal implements Cloneable{ //
	
    protected String name;
    protected int age;
    protected String color;
    protected Owner owner;  

    // Constructor for an animal that has an owner
    public Animal(String name, int age, String color, Owner owner) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.owner = owner;  
    }

    // Constructor for an animal that has no owner
    public Animal(String name, int age, String color) {
        this(name, age, color, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public abstract void eat();
    
    public abstract void sleep();

    public abstract String toString();

    public boolean equals(Object obj) {
        if (this == obj) 
            return true;  
        if (obj == null || !(obj instanceof Animal)) 
            return false;

        Animal animal = (Animal) obj; 
        
        return age == animal.age &&
               Objects.equals(name, animal.name) &&
               Objects.equals(color, animal.color) &&
               Objects.equals(owner, animal.owner);
    }

    public Animal clone() {
        try {
            Animal cloned = (Animal) super.clone();
            if (owner != null) {
                cloned.owner = new Owner(owner.getName(), owner.getPhone());
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported"); // If an error is thrown
        }
    }
}
