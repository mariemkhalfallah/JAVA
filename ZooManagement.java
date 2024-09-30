public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "lion";
        lion.age = 12;
        lion.family = "Felidae";
        lion.isMammal = true;

        Animal tiger = new Animal();
        tiger.name = "tiger";
        tiger.age = 10;
        tiger.family = "Felidae";
        tiger.isMammal = true;

        zoo myZoo = new zoo("myzoo", "bbb");

        System.out.println("Adding lion: " + myZoo.addAnimal(lion));
        System.out.println("Adding tiger: " + myZoo.addAnimal(tiger));
        System.out.println("Is zoo full? " + myZoo.isZooFull());

        for (int i = 0; i < 23; i++) {
            Animal newAnimal = new Animal();
            newAnimal.name = "animal" + i;
            newAnimal.age = i;
            newAnimal.family = "GenericFamily";
            newAnimal.isMammal = true;
            myZoo.addAnimal(newAnimal);
        }

        System.out.println("Is zoo full? " + myZoo.isZooFull());
        myZoo.displayAnimals();
    }
}
