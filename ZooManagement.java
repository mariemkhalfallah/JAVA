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

        Animal bear = new Animal();
        bear.name = "bear";
        bear.age = 8;
        bear.family = "Ursidae";
        bear.isMammal = true;

        zoo myZoo = new zoo("myzoo", "bbb", 2);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tiger));
        System.out.println(myZoo.addAnimal(bear));
        System.out.println(myZoo);
    }
}
