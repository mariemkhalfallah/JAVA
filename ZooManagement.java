public class ZooManagement {
    public static void main(String[] args) {
        Animal Ani = new Animal();
        Ani.name = "lion";
        Ani.age = 12;
        Ani.family = "eee";
        Ani.isMammal = true;

        zoo myZoo = new zoo();
        myZoo.name = "myzoo";
        myZoo.city = "bbb";
        myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];
        myZoo.animals[1] = Ani; // Add the animal to the zoo


        System.out.println(myZoo);
        System.out.println(myZoo.toString());
    }
}
