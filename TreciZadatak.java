//3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.

package postbin;

import java.util.Scanner;

public class TreciZadatak {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi broj: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }
}
