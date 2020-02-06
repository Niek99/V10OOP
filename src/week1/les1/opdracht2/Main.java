package week1.les1.opdracht2;

public class Main {
    public static void main(String[] arg) {
        Klant klant1 = new Klant("Jan", "Nijenoord 1", "Utrecht");
        Klant klant2 = new Klant("Wim", "Oudenoord 340", "Utrecht");

        System.out.println(klant1.getNaam());
        System.out.println(klant2);
    }
}
