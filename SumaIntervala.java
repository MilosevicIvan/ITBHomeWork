//[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole,
// m <= n. Ispisati sumu brojeva [m, n].

package DomaciDodatni;

import java.util.Scanner;

public class SumaIntervala {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Unesite manji broj: ");
        int m = sc.nextInt();
        System.out.println("Unesite veci broj: ");
        int n = sc.nextInt();

        int suma = 0;

        for(int i = m; i <= n; i++){
            suma += i;
        }
        System.out.println(suma);





    }
}
