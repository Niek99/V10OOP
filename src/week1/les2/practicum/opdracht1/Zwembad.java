package week1.les2.practicum.opdracht1;

public class Zwembad {
    double breedte, lengte, diepte;

    public Zwembad(double breed, double len, double dep){
        breedte = breed;
        lengte = len;
        diepte = dep;
    }

    public Zwembad(){

    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setBreedte(double breed){
        breedte = breed;
    }

    public void setLengte(double len){
        lengte = len;
    }

    public void setDiepte(double dep){
        diepte = dep;
    }

    public double inhoud(){
        return breedte * lengte * diepte;
    }

    public String toString(){
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang en " + diepte + "meter diep";
    }
}
