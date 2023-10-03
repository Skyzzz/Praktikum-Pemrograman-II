package Praktikum1;

import java.util.Scanner;

public class PRAK105_2110817210009_MuhammaKhafieRamadhan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Makanan Favorit: ");
        String favFood = input.nextLine();

        System.out.println("Masukan Hobi: ");
        String hobby = input.nextLine();

        System.out.println("Aku Suka Makan " + favFood + ", " + "dan Hobiku " + hobby);
    }

}