package Domaci17Decembar;

// 41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

import java.util.Scanner;

public class Zadatak41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] niz = new double[10];
        System.out.println("Unesite 10 bilo kojih brojeva vecih od 0:");

        for(int i=0; i<10; i++){
            niz[i]=sc.nextDouble();
        }

        double suma=0;
        for(int i=0; i<niz.length; i++){
            suma+=niz[i];
        }
        System.out.println(suma / 10);
    }
}
