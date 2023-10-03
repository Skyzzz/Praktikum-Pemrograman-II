package Praktikum_1;

import java.util.Scanner;

public class PRAK101_2110817210009_MuhammaKhafieRamadhan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        float berat = input.nextFloat();

        String bulan = switch (bulanLahir) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> throw new AssertionError();
        };

        System.out.println("\nNama Lengkap " + namaLengkap + ", " + "Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bulan + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggi + " cm" + " dan Berat Badan " + berat + " kilogram");
    }

}