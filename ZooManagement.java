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

        myZoo.displayAnimals();

        boolean removedLion = myZoo.removeAnimal(lion);
        System.out.println("Removed lion: " + removedLion);

        myZoo.displayAnimals();

        Animal bear = new Animal();
        bear.name = "bear";
        boolean removedBear = myZoo.removeAnimal(bear);
        System.out.println("Removed bear: " + removedBear);

        myZoo.displayAnimals();
    }
}
