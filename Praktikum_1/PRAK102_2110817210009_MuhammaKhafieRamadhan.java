package Praktikum_1;

import java.util.Scanner;

public class PRAK102_2110817210009_MuhammaKhafieRamadhan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int angkaAwal, bilangan, i = 10;

        System.out.print("Masukkan Bilangan: ");
        angkaAwal = input.nextInt();

        while (i > 0){
            if (angkaAwal % 5 == 0){
                bilangan = (angkaAwal / 5) - 1;
            } else {
                bilangan = angkaAwal;
            }

            if (i == 10){
                System.out.print(bilangan);
            } else {
                System.out.print(", " + bilangan);
            }
            angkaAwal++;
            i--;
        }

    }

}