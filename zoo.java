import java.util.Arrays;

class zoo {
    private String name;
    private String city;
    private final int nbrCages = 25;
    private Animal[] animals;
    private int nbrAnimal;
    
    public zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.nbrAnimal = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Error: Zoo name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    // Getter et Setter pour la ville
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimal() {
        return nbrAnimal;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages + ", Animals: " + Arrays.toString(animals);
    }

    // Méthode addAnimal avec vérification si le zoo est plein
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Unable to add animal: Zoo is full.");
            return false;
        }
        if (searchAnimal(animal.getName()) == -1) {
            animals[nbrAnimal] = animal;
            nbrAnimal++;
            return true;
        } else {
            System.out.println("Animal " + animal.getName() + " already exists in the zoo.");
            return false;
        }
    }

    public boolean isZooFull() {
        return nbrAnimal >= nbrCages;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());
        if (index != -1) {
            for (int i = index; i < nbrAnimal - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbrAnimal - 1] = null;
            nbrAnimal--;
            return true;
        } else {
            return false;
        }
    }

    public void displayAnimals() {
        if (nbrAnimal == 0) {
            System.out.println("No animals in the zoo.");
        } else {
            System.out.println("Animals in the zoo:");
            for (int i = 0; i < nbrAnimal; i++) {
                System.out.println(animals[i]);
            }
        }
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static zoo comparerZoo(zoo z1, zoo z2) {
        if (z1.nbrAnimal > z2.nbrAnimal) {
            return z1;
        } else {
            return z2;
        }
    }
}
