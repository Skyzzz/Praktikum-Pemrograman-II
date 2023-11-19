package Praktikum_4.soal2;

public class HewanPeliharaan {
    private String nama, ras;

    HewanPeliharaan(String r, String n) {
        this.nama = r;
        this.ras = n;
    }

    public void display(){
        System.out.println("\nDetail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
