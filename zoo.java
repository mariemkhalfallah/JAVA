import java.util.Arrays;

class zoo {
    String name;
    String city;
    final int nbrCages = 25;
    Animal[] animals;
    int nbrAnimal;

    public zoo(String name, String city) {
        this.name = name;
        this.city = city;
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
                return false;
            }
        } else {
            return false;
        }
    }

    boolean isZooFull() {
        return nbrAnimal >= nbrCages;
    }

    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);
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
