package praktikum2.soal3;

public class Soal3Main {

    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
//        Pada baris ini terjadi error karena kurangnya titik koma (;)
//        p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
//        Pada baris ini perlu menambahkan deklarasi umur = 17 agar sesuai dengan output.
        p1.umur = 17;

//        pada baris ini ada kesalahan karena ada tambahan "Pegawai" yang mana tidak sesuai dengan output.
//        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
//        Pada baris ini perlu ditambahkan " tahun" agar sesuai dengan output.
//        System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }

}
