package soal1;

public class HewanPeliharaan {
    private String nama, ras;

    public HewanPeliharaan(String r, String n) {
        this.nama = r;
        this.ras = n;
    }

    public void display(){
        System.out.println("\nDetail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}
