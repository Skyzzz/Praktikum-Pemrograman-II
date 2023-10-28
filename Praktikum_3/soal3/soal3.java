package Praktikum3.soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class soal3 {
    static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            Mahasiswa.tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa.tambahMahasiswa();
                    break;
                case 2:
                    Mahasiswa.hapusMahasiswa();
                    break;
                case 3:
                    Mahasiswa.cariMahasiswa();
                    break;
                case 4:
                    Mahasiswa.tampilkanDaftarMahasiswa();
                    break;
                case 0:
                    Mahasiswa.keluarProgram();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}
