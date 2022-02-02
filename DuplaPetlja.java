package DomaciZadatak;

/* 1.Dupla petlja:
U konzolu ispisati dane (dan 1, dan 2...dan 7) za 3 nedelje
(Primer ispisa:
Week: 1
Day: 1
Day: 2
Day: 3 //sve do Day: 7
Week: 2
Day: 1
Day: 2
Day: 3.......
Week: 3
Day: 1
Day: 2
Day: 3......)

 */

public class DuplaPetlja {
    public static void main(String[] args) {


        int nedelja = 3;
        int dan = 7;

        for (int i = 1; i <= nedelja; ++i){
            System.out.println("Nedelja: " + i);

            for (int j = 1; j<= dan; ++j){
                System.out.println("Dan: " + j);
            }
        }
    }
}
