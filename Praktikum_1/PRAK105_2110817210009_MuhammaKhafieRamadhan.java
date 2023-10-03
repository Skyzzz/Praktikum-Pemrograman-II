package Praktikum_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2110817210009_MuhammaKhafieRamadhan {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        float jari_jari = input.nextFloat();

        System.out.print("Masukkan tinggi: ");
        float tinggi = input.nextFloat();

        double volume = 3.14 * jari_jari * jari_jari * tinggi;
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.print("\nVolume Tabung dengan jari-jari " + jari_jari + " cm dan tinggi " + tinggi + " cm adalah " + df.format(volume) + " m3");

    }
}
