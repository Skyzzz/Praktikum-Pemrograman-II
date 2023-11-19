package Praktikum_4.soal2;

public class Anjing extends HewanPeliharaan{
    private String warnaBulu, kemampuan;

    public Anjing(String r, String n, String w, String k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }

    public void displayDetailAnjing(){
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Kemampuan : " + kemampuan);
    }
}
