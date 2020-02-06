package week1.les2.opdracht1;

public class Piloot {
    String naam;
    int vlieguren;
    double salaris;

    public Piloot(String nm){
        naam = nm;
    }

    public int getVlieguren() {
        return vlieguren;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

    public void verhoogVliegurenMet(int uren){
        vlieguren = vlieguren + uren;
    }

    public String toString() {
        return naam + " heeft " + vlieguren + " vlieguren gemaakt en verdient " + salaris;
    }
}
