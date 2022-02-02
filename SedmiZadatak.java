//7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

package postbin;

import java.util.Scanner;

public class SedmiZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj meseca: ");

        int mesec = sc.nextInt();

        System.out.print("Unesite dan: ");
        int dan = sc.nextInt();

        switch (mesec){
            case 1:
                if(dan>= 1 && dan<=20){
                    System.out.println("Jarac");
                }
                else if (dan <=0 && dan> 31){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Vodolija");
                }
                break;

            case 2:
                if(dan>= 21 && dan<=19){
                    System.out.println("Vodolija");
                }
                else if (dan <=0 && dan> 28){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Ribe");
                }
                break;

            case 3:
                if(dan>= 1 && dan<=20){
                    System.out.println("Ribe");
                }
                else if (dan <=0 && dan> 31){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Ovan");
                }
                break;

            case 4:
                if(dan>= 1 && dan<=20){
                    System.out.println("Ovan");
                }
                else if (dan <=0 && dan> 31){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Bik");
                }
                break;

            case 5:
                if(dan>= 1 && dan<=21){
                    System.out.println("Bik");
                }
                else if (dan <=0 && dan> 31){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Blizanci");
                }
                break;

            case 6:
                if(dan>= 1 && dan<=21){
                    System.out.println("Blizanci");
                }
                else if (dan <=0 && dan> 31){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Rak");
                }
                break;

            case 7:
                if(dan>= 1 && dan<=22){
                    System.out.println("Rak");
                }
                else if (dan <=0 && dan> 31){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Lav");
                }
                break;

            case 8:
                if(dan>= 1 && dan<=22){
                System.out.println("Lav");
            }
                else if (dan <=0 && dan> 31){
                System.out.println("Pogresan datum.");
            }
                else {
                System.out.println("Devica");
            }
                break;

            case 9:
                if(dan>= 1 && dan<=22){
                    System.out.println("Devica");
                }
                else if (dan <=0 && dan> 31){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Vaga");
                }
                break;

            case 10:
                if(dan>= 1 && dan<=23){
                    System.out.println("Vaga");
                }
                else if (dan <=0 && dan> 31){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Skorpija");
                }
                break;

            case 11:
                if(dan>= 1 && dan<=22){
                    System.out.println("Skorpija");
                }
                else if (dan <=0 && dan> 31){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Strelac");
                }
                break;

            case 12:
                if(dan>= 1 && dan<=21){
                    System.out.println("Strelac");
                }
                else if (dan <=0 && dan> 31){
                    System.out.println("Pogresan datum.");
                }
                else {
                    System.out.println("Jarac");
                }
                break;

            default:
                System.out.println("Pogresan datum.");
                break;





        }

    }
}
