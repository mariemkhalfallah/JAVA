public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("lion");
        lion.setAge(12);
        lion.setFamily("Felidae");
        lion.setMammal(true);

        Animal tiger = new Animal();
        tiger.setName("tiger");
        tiger.setAge(10);
        tiger.setFamily("Felidae");
        tiger.setMammal(true);

        zoo myZoo = new zoo("myzoo", "bbb");

        System.out.println("Adding lion: " + myZoo.addAnimal(lion));
        System.out.println("Adding tiger: " + myZoo.addAnimal(tiger));

        Animal invalidAnimal = new Animal();
        invalidAnimal.setName("invalid");
        invalidAnimal.setAge(-5);

        zoo invalidZoo = new zoo("", "ccc");
    }
}
