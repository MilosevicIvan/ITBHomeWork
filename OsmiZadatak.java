//8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
//	"Dobrodosao u {x}. razred, {ime} {prezime}",
//	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati
//	jednu odgovarajucu
//    poruku od:
//	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

package postbin;

import java.util.Scanner;

public class OsmiZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = sc.next();
        System.out.println("Unesite prezime: ");
        String prezime = sc.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godina = sc.nextInt();

        if (godina > 2015) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje.");
        } else if (godina < 2002) {
            System.out.println(ime + " " + prezime + " je zavrsio/la skolu.");
        } else {
            switch (godina) {

                case 2014: {
                    System.out.println("Dobrodosao u 1.razred, " + ime + " " + prezime);
                }
                break;

                case 2013: {
                    System.out.println("Dobrodosao u 2.razred, " + ime + " " + prezime);
                }
                break;

                case 2012: {
                    System.out.println("Dobrodosao u 3.razred, " + ime + " " + prezime);
                }
                break;

                case 2011: {
                    System.out.println("Dobrodosao u 4.razred, " + ime + " " + prezime);
                }
                break;

                case 2010: {
                    System.out.println("Dobrodosao u 5.razred, " + ime + " " + prezime);
                }
                break;

                case 2009: {
                    System.out.println("Dobrodosao u 6.razred, " + ime + " " + prezime);
                }
                break;

                case 2008: {
                    System.out.println("Dobrodosao u 7.razred, " + ime + " " + prezime);
                }
                break;

                case 2007: {
                    System.out.println("Dobrodosao u 8.razred, " + ime + " " + prezime);
                }
                break;

                case 2006: {
                    System.out.println("Dobrodosao u 9.razred, " + ime + " " + prezime);
                }
                break;

                case 2005: {
                    System.out.println("Dobrodosao u 10.razred, " + ime + " " + prezime);
                }
                break;

                case 2004: {
                    System.out.println("Dobrodosao u 11.razred, " + ime + " " + prezime);
                }
                break;

                case 2003: {
                    System.out.println("Dobrodosao u 12.razred, " + ime + " " + prezime);
                }
                break;


            }
        }
    }
}