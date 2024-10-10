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

        zoo myZoo1 = new zoo("myzoo1", "bbb");
        zoo myZoo2 = new zoo("myzoo2", "ccc");

        myZoo1.addAnimal(lion);
        myZoo2.addAnimal(tiger);
        for (int i = 0; i < 5; i++) {
            Animal newAnimal = new Animal();
            newAnimal.name = "animal" + i;
            newAnimal.age = i;
            newAnimal.family = "GenericFamily";
            newAnimal.isMammal = true;
            myZoo1.addAnimal(newAnimal);
        }

        System.out.println("Zoo with more animals:");
        zoo largerZoo = zoo.comparerZoo(myZoo1, myZoo2);
        System.out.println(largerZoo);
    }
}
