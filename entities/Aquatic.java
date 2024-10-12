package entities;

public class Aquatic extends Animal {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, isMammal, age);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic Name: " + name + ", Family: " + family + ", Is Mammal: " + isMammal + ", Age: " + age + ", Habitat: " + habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}
