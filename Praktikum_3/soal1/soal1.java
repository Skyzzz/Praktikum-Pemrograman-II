package Praktikum_3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class soal1 {
    public static void main (String[] args){

        Scanner scannr = new Scanner(System.in);
        System.out.print("Jumlah Dadu: ");
        int input = scannr.nextInt();
        int total = 0;

        System.out.println();

        LinkedList<Dadu> dadu = new LinkedList<Dadu>();
        for (int i = 0; i <= input; i++ ) {
            dadu.add(new Dadu());
            dadu.getLast().acakNilai();
        }

        for (int i = 1; i < dadu.size(); i++) {
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.get(i).getNilai());
            total = total + dadu.get(i).getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + total);

    }
}
