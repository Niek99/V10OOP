package week1.les1.opdracht4;

public class Student {
    public String naam;

    public Student(String nm){
        naam = nm;
    }

    public String getNaam(){
        return naam;
    }

    public String toString() {
        String s = "De naam van de student = " + naam;
        return s;
    }
}
