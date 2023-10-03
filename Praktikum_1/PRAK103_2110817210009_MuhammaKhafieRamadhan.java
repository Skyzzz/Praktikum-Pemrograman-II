package Praktikum_1;

import java.util.Scanner;

public class PRAK103_2110817210009_MuhammaKhafieRamadhan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Baris dan Bilangan Awal: ");
        int banyakData = input.nextInt();
        int bilanganAwal = input.nextInt();

        int i = banyakData;

        do {
            if (bilanganAwal % 2 != 0){
                if (i == banyakData){
                    System.out.print(bilanganAwal);
                } else {
                    System.out.print(", " + bilanganAwal);
                }
            } else {
                if (i == banyakData){
                    System.out.print(bilanganAwal + 1);
                } else {
                    System.out.print(", " + (bilanganAwal + 1));
                }
            }
            bilanganAwal+=2;
            i--;
        } while (i > 0);
    }

}
