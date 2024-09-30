public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "lion";
        lion.age = 12;
        lion.family = "Felidae";
        lion.isMammal = true;


        zoo myZoo = new zoo("myzoo", "bbb", 2);


        myZoo.addAnimal(lion);


        myZoo.displayAnimals();


        int index = myZoo.searchAnimal("lion");
        System.out.println("Index of lion: " + index);


        Animal lionDuplicate = new Animal();
        lionDuplicate.name = "lion";
        lionDuplicate.age = 12;
        lionDuplicate.family = "Felidae";
        lionDuplicate.isMammal = true;


        boolean added = myZoo.addAnimal(lionDuplicate);
        System.out.println("Was the duplicate lion added? " + added);


        myZoo.displayAnimals();


        index = myZoo.searchAnimal("lion");
        System.out.println("Index of duplicate lion: " + index);
    }
}
