import java.util.Arrays;
class zoo {
    String name;
    String city;
    int nbrCages;
    Animal[] animals;

    @Override
    public String toString() {
        return name + city  + nbrCages + Arrays.toString(animals) ;
    }
}