package Domaci4;

/*
30. -||- Izracunati proizvod elemenata tog niza. Primer [2 4] -> 8.
30*. Napisati funkciju koja racuna proizvod elemenata zadatog niza.
 */

public class PasteBin30SaZvezdicom {
    public static void main(String[] args) {

        int[] niz = {1,2,3,4,5,6,7,8};

        int konacniProizvod = proizvod(niz);
        System.out.println(konacniProizvod);
    }

    public static int proizvod(int[] niz){

        int proizvod = 1;

        for(int i = 0; i< niz.length; i++){
            proizvod *= niz[i];
        } return proizvod;
    }
}
