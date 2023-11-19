package soal1;

import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args){
        String nama, ras;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        nama = scanner.nextLine();
        System.out.print("Ras: ");
        ras = scanner.nextLine();

        HewanPeliharaan hewanPeliharaan = new HewanPeliharaan(nama, ras);

        hewanPeliharaan.display();
    }
}
