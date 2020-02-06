package week1.les1.opdracht5;

public class Student {
    public String naam;
    public Integer studentNummer;

    public Student(String nm){
        naam = nm;
    }

    public Student(String nm, Integer stNr){
        naam = nm;
        studentNummer = stNr;
    }

    public String getNaam(){
        return naam;
    }

    public Integer getStudentNummer(){
        return studentNummer;
    }

    public void setStudentNummer(Integer stNr){
        studentNummer = stNr;
    }

    public String toString() {
        String s = "Deze student heet " + naam + " en heeft studentnummer: " + studentNummer;
        return s;
    }
}
