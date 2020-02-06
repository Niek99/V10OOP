package week1.les1.opdracht2;

public class Klant {
    private String naam;
    private String adres;
    private String plaats;

    public Klant(String nm, String adrs, String plts){
        naam = nm;
        adres = adrs;
        plaats = plts;
    }

    public String getNaam(){
        return naam;
    }
    public String getAdres(){
        return adres;
    }
    public String getPlaats(){
        return plaats;
    }
}
