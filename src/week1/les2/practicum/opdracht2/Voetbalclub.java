package week1.les2.practicum.opdracht2;

public class Voetbalclub {
    String naam;
    int aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten, aantalGespeeld;

    public Voetbalclub(String nm){
        naam = nm;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten(){
        aantalPunten =  (aantalGewonnen * 3) + aantalGelijk;
        return aantalPunten;
    }

    public int aantalGespeeld(){
        aantalGespeeld = aantalGewonnen + aantalGelijk + aantalVerloren;
        return aantalGespeeld;
    }

    public String toString(){
        return naam + " " + aantalGespeeld + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten;
    }
}
