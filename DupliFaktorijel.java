//[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetg broja n. Dupli faktorijel broja n je:
//n!! = n * (n-2) * (n-4) * ... * (2 ili 1)

package DomaciDodatni;

import java.util.Scanner;

public class DupliFaktorijel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();

        int fact = 1;

        for(int i = n; i > 1; i -= 2){
            fact *= i;

        }
        System.out.println(fact);
    }
}
