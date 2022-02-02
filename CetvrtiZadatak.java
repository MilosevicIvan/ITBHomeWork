//4. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

package postbin;

import java.util.Scanner;

public class CetvrtiZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Upisi negativan broj: ");
        int n = sc.nextInt();

        for(int i = n; i<=0; i++){
            System.out.println(i);
        }
    }
}
