package main;

import entities.Animal;
import entities.zoo;
import entities.Aquatic;
import entities.Terrestrial;
import entities.Dolphin;
import entities.Penguin;

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

        Animal animal = new Animal();
        Aquatic aquatic = new Aquatic("Aquatic Family", "Aquatic Animal", 5, true, "Ocean");
        Terrestrial terrestrial = new Terrestrial("Terrestrial Family", "Terrestrial Animal", 4, true, 4);
        Dolphin dolphin = new Dolphin("Dolphin Family", "Dolphin", 8, true, "Sea");
        Penguin penguin = new Penguin("Penguin Family", "Penguin", 6, true, "Arctic");

        System.out.println(animal);
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
    }
}
