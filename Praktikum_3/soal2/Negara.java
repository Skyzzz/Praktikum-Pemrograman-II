package Praktikum_3.soal2;

import java.util.HashMap;
import java.util.Scanner;

public class Negara {
    private String nama, jenis, namapresiden;
    private int tanggal, bulan, tahun;

    public Negara(String nama, String jenis, String namapresiden, int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenis = jenis;
        this.namapresiden = namapresiden;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getBulan() {
        return bulan;
    }

    void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNama Negara: ");
        nama = scanner.nextLine();
        System.out.print("Jenis Kepemimpinan: ");
        jenis = scanner.nextLine();
        System.out.print("Nama Presiden: ");
        namapresiden = scanner.nextLine();
        if (jenis.equalsIgnoreCase("presiden") || jenis.equalsIgnoreCase("perdana menteri")) {
            System.out.print("Tanggal Kemerdekaan: ");
            tanggal = scanner.nextInt();
            System.out.print("Bulan Kemerdekaan: ");
            bulan = scanner.nextInt();
            System.out.print("Tahun Kemerdekaan: ");
            tahun = scanner.nextInt();
        }
    }

    void tampilkan() {
        HashMap<Integer, String> month = new HashMap<Integer, String>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        if (jenis.equalsIgnoreCase("presiden") || jenis.equalsIgnoreCase("perdana menteri")) {
            System.out.println("\nNegara " + nama + " mempunyai " + jenis + " bernama " + namapresiden);
        } else if (jenis.equalsIgnoreCase("monarki")) {
            System.out.println("\nNegara " + nama + " mempunyai Raja" + " bernama " + namapresiden);
        }
        if (jenis.equalsIgnoreCase("presiden") || jenis.equalsIgnoreCase("perdana menteri")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggal + " " + month.get(getBulan()) + " " + tahun);
        }

    }
}