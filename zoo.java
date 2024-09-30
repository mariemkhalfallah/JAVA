import java.util.Arrays;

class zoo {
    String name;
    String city;
    int nbrCages; 
    Animal[] animals;
    int nbrAnimal;

    public zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
        this.nbrAnimal = 0;
    }

    @Override
    public String toString() {
        return "Zoo Name: " + name + ", City: " + city + ", Number of Cages: " + nbrCages + ", Animals: " + Arrays.toString(animals);
    }

    boolean addAnimal(Animal animal) {

        if (searchAnimal(animal.name) == -1) {

            if (nbrAnimal < nbrCages) {
                animals[nbrAnimal] = animal;
                nbrAnimal++;
                return true;
            } else {
                System.out.println("Unable to add animal: Zoo is full.");
                return false;
            }
        } else {
            System.out.println("Animal " + animal.name + " already exists in the zoo.");
            return false;
        }
    }


     void displayAnimals() {
        if (nbrAnimal == 0) {
            System.out.println("No animals in the zoo.");
        } else {
            System.out.println("Animals in the zoo:");
            for (int i = 0; i < nbrAnimal; i++) {
                System.out.println(animals[i]);
            }
        }
    }


     int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimal; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
