package Praktikum3.soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {

        String nama = "", jenis="", namapresiden="";
        int tanggal = 0, bulan = 0, tahun = 0;
        Scanner scanner = new Scanner(System.in);
        Negara negara = new Negara(nama, jenis, namapresiden, tanggal, bulan, tahun);
        LinkedList<Negara> llNegara = new LinkedList<Negara>();

        int jumlahNegara;
        System.out.print("Jumlah Negara: ");
        jumlahNegara = scanner.nextInt();

        for (int i = 0; i < jumlahNegara; i++){
            Negara c = new Negara(nama, jenis, namapresiden, tanggal, bulan, tahun);
            c.getData();
            llNegara.add(c);
        }

        for (int i = 0; i < llNegara.size(); i++){
            Negara nIndex = llNegara.get(i);
            nIndex.tampilkan();
        }
    }
}
