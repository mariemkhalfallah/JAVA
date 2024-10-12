package entities;

public class Animal {
    public String name;
    public int age;
    public String family;
    public boolean isMammal;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFamily() {
        return family;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal Name: " + name + ", Family: " + family + ", Is Mammal: " + isMammal + ", Age: " + age;
    }
}
