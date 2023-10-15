package praktikum2.soal1;

public class Soal1Main {

    public static void main(String[] args){

        Buah Apel = new Buah(
                "Apel",
                0.4f,
                7000f,
                40f
        );

        Buah Mangga = new Buah(
                "mangga",
                0.2f,
                3500f,
                15f
        );

        Buah Alpukat = new Buah(
                "alpukat",
                0.25f,
                10000f,
                12f
        );

        Apel.info();
        Mangga.info();
        Alpukat.info();
    }

}
