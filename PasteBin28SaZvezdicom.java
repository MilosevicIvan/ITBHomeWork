package Domaci4;

/*
28. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
Izracunati sumu tog niza. [Primer: 1+2+3+4+5] = 15
28*. Napraviti funkciju koja vraca sumu prosledjenog niza.
 */

import java.util.Scanner;

public class PasteBin28SaZvezdicom {
    public static void main(String[] args) {

        int niz[] = new int[5];
        System.out.println("Unesi pet brojeva:");

        Scanner sc = new Scanner(System.in);

        niz[0] = sc.nextInt();
        niz[1] = sc.nextInt();
        niz[2] = sc.nextInt();
        niz[3] = sc.nextInt();
        niz[4] = sc.nextInt();

        int zbir= zbirNiza(niz);
        System.out.println(zbir);
    }

    public static int zbirNiza(int niz[]){
        int zbir = 0;
        for(int i=0; i<niz.length; i++){
            zbir += niz[i];
        } return zbir;
    }
}
