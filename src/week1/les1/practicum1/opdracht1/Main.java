package week1.les1.practicum1.opdracht1;

public class Main {
    public static void main(String[] args){
        //Opdracht 1
        for(int i=1; i <= 10; i++){
            System.out.println(i);
        }

        //Opdracht 2
        int count = 1;
        while (count <= 10){
            System.out.println(count);
            count ++;
        }

        //Opdracht 3
        for (int i=1; i <=10; i++){
            System.out.println(Math.random());
        }

        //opdracht 4
        int som = 0;
        for (int i=0; i<=39; i++){
            som += i;
        }
        System.out.println(som);

        //Opdracht 5
        for(int i=0; i<=10; i++){
           String zaag = "s";
            if(i % 2 == 1) {
                zaag = "ss";
            }
            System.out.println(zaag);
        }
    }
}
