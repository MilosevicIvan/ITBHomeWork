package Domaci4;

/*
29. -||-. Ispisati svaki treci element u obrnutom redosledu.
Primer: [1 2 3 4 5 6 7 8] -> 8 5 2.
*/

public class PasteBin29 {
    public static void main(String[] args) {

        int[] niz = {1,2,3,4,5,6,7,8};
        for(int i=(niz.length - 1); i>=0; i-=3){
            System.out.println(niz[i]);
        }
    }
}
