import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("donner le nombre de cage :");
        String nbrCages = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("donner le nom de zoo :");
        String zooName = scanner.nextLine();
        System.out.printf(zooName  +  " comporte " + nbrCages + " cages ");


    }
}