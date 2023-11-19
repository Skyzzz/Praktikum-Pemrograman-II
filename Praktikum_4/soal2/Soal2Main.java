package soal2;

import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args) {
        int pilihanHewanPeliharaan;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing\n2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        pilihanHewanPeliharaan = scanner.nextInt();
        scanner.nextLine();

        if (pilihanHewanPeliharaan == 1) {
            String nama, ras, warnaBulu;

            System.out.print("\nNama hewan peliharaan: ");
            nama = scanner.nextLine();
            System.out.print("Ras: ");
            ras = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            warnaBulu = scanner.nextLine();

            Kucing kucing = new Kucing(nama, ras, warnaBulu);
            kucing.displayDetailKucing();
        } else if (pilihanHewanPeliharaan == 2) {
            String nama, ras, warnaBulu, kemampuan;

            System.out.print("\nNama hewan peliharaan: ");
            nama = scanner.nextLine();
            System.out.print("Ras: ");
            ras = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            warnaBulu = scanner.nextLine();
            System.out.print("Kemampuan: ");
            kemampuan = scanner.nextLine();

            Anjing anjing = new Anjing(nama, ras, warnaBulu, kemampuan);
            anjing.displayDetailAnjing();
        }
    }
}
