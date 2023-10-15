package praktikum2.soal3;

//Pada baris ini terjadi error karena nama class dari filenya salah, yang harusnya Pegawai tapi tertulis Employee.
//public class Employee {
public class Pegawai {

    public String nama;
//    Pada baris ini terjadi error karena metode asal tersebut bertipe data char tetapi pada class Soal3Main p1.asal tipe datanya adalah String, maka tipe data harus menggunakan String.
//    public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }

//    Pada baris ini terjadi error karena tidak adanya parameter dari metode tersebut, maka perlu ditambahkan parameter agar tidak terjadi error.
//    public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
