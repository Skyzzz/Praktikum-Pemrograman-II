package praktikum2.soal2;

public class Kopi {
    String namaKopi, ukuran, pembeli;
    float harga, pajak;

    void setPembeli (String pembeli){
        this.pembeli = pembeli;
    }

    String getPembeli(){
        return this.pembeli;
    }

    float getPajak(){
        pajak = (harga * 11 / 100);
        return pajak;
    }

    void info(){
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }
}
