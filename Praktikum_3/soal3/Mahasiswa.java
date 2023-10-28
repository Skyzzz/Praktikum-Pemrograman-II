package Praktikum_3.soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Mahasiswa> daftarMahasiswa = soal3.daftarMahasiswa;

    static void tampilkanMenu() {
        System.out.println("\nMenu: ");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
        System.out.println("3. Cari Mahasiswa berdasarkan NIM");
        System.out.println("4. Tampilkan Daftar Mahasiswa");
        System.out.println("0. Keluar");
        System.out.print("\nPilihan: ");
    }

    static void tambahMahasiswa() {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        String nim = scanner.nextLine();

        boolean nimSudahAda = false;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNIM().equals(nim)) {
                nimSudahAda = true;
                break;
            }
        }

        if (!nimSudahAda) {
            Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
            daftarMahasiswa.add(mahasiswa);
            System.out.println("Mahasiswa " + nama + " ditambahkan.");
        } else {
            System.out.println("NIM sudah ada. Mohon masukkan NIM unik.");
        }
    }

    static void hapusMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nim = scanner.nextLine();

        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNIM().equals(nim)) {
                daftarMahasiswa.remove(mahasiswa);
                System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                return;
            }
        }

        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }

    static void cariMahasiswa() {
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = scanner.nextLine();

        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNIM().equals(nim)) {
                System.out.println("Data Mahasiswa:");
                System.out.println("NIM: " + mahasiswa.getNIM() + ", Nama: " + mahasiswa.getNama());
                return;
            }
        }

        System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
    }

    static void tampilkanDaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNIM() + ", Nama: " + mahasiswa.getNama());
        }
    }

    static void keluarProgram() {
        daftarMahasiswa.clear();
        System.out.println("Terima kasih!");
    }
}
