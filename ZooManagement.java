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


        zoo myZoo = new zoo("myzoo", "bbb", 2);


        System.out.println("Adding lion: " + myZoo.addAnimal(lion));
        System.out.println("Adding tiger: " + myZoo.addAnimal(tiger));


        myZoo.displayAnimals();


        Animal lionDuplicate = new Animal();
        lionDuplicate.name = "lion";
        lionDuplicate.age = 12;
        lionDuplicate.family = "Felidae";
        lionDuplicate.isMammal = true;


        boolean addedDuplicate = myZoo.addAnimal(lionDuplicate);
        System.out.println("Adding duplicate lion: " + addedDuplicate);


        Animal bear = new Animal();
        bear.name = "bear";
        bear.age = 8;
        bear.family = "Ursidae";
        bear.isMammal = true;

        boolean addedBear = myZoo.addAnimal(bear);
        System.out.println("Adding bear: " + addedBear);


        myZoo.displayAnimals();
    }
}
