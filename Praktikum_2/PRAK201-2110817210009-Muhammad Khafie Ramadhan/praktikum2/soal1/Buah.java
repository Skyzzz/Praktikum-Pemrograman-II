package praktikum2.soal1;

public class Buah {

    String nama;
    float berat, harga, jumlah;

    public Buah(String nama, float berat, float harga, float jumlah){
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public void info(){
        double diskon = (jumlah >= 4) ? (int) (Math.floor (jumlah / 4)) * (4 * harga) * 0.02 : 0;
        float hargaSebelumDiskon = jumlah / berat * harga;

        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlah + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", hargaSebelumDiskon));
        System.out.println("Total Diskon: Rp" + String.format("%.2f", diskon));
        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", hargaSebelumDiskon - diskon));
        System.out.println();
    }

}
