package Domaci4;

/*
27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
Ispisati svaki drugi element tog niza.
*/

import java.util.Scanner;

public class PasteBin27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi broj:");

        int[] niz = new int[5];

        niz[0] = sc.nextInt();
        niz[1] = sc.nextInt();
        niz[2] = sc.nextInt();
        niz[3] = sc.nextInt();
        niz[4] = sc.nextInt();

        for(int i=0; i<niz.length; i++) {
            if (i%2==0) {
                System.out.println(niz[i]);
            }
        }

    }

}
