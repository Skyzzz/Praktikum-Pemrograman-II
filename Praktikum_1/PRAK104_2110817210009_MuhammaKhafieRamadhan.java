package Praktikum_1;

import java.util.Scanner;

public class PRAK104_2110817210009_MuhammaKhafieRamadhan {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int poinAbu = 0;
        int poinBagas = 0;

        char[] suitAbu = new char[3];
        char[] suitBagas = new char[3];

        System.out.print("Tangan Abu: ");
        for (int i = 0; i < 3; i++) {
            suitAbu[i] = input.next().charAt(0);
        }

        System.out.print("Tangan Bagas: ");
        for (int i = 0; i < 3; i++) {
            suitBagas[i] = input.next().charAt(0);
        }

        for (int i = 0; i < 3; i++) {
            if (suitAbu[i] == suitBagas[i]) {
                continue;
            }

            if ((suitAbu[i] == 'G' && suitBagas[i] == 'K') || (suitAbu[i] == 'K' && suitBagas[i] == 'B') || (suitAbu[i] == 'B' && suitBagas[i] == 'G')) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }

        if (poinAbu == poinBagas) {
            System.out.print("\nSeri");
        } else if (poinAbu > poinBagas) {
            System.out.print("\nAbu");
        } else {
            System.out.print("\nBagas");
        }
    }
}
