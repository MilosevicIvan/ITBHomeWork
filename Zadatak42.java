package Domaci17Decembar;

// 42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

import java.util.Scanner;

public class Zadatak42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] niz = {"Ivan", "Marija", "Petar", "Jelena", "Mirko", "Sofija"};

       // for(int i = 0; i < niz.length; i++){
           // if (niz[i].equals("Marija")){
           //     System.out.println("Ime Marija postoji u nizu.");
           // }
            //else if (niz[i].equals("Petar")){
            //    System.out.println("Ime Petar postoji u nizu");
           // }
        ime(niz);
        if(ime(niz)==true){
            System.out.println("U nizu postoji ime Marija ili Petar");
        } else{
            System.out.println("U nizu ne postoji ni ime Marija ni Petar");};

    }



    public static boolean ime (String[] niz){

        boolean ime = false;
        for(int i = 0; i < niz.length; i++){
            if (niz[i].equals("Marija") || niz[i].equals("Petar")){
                ime = true;
            };
        } return ime;





    }



}




