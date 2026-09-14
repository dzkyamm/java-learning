package week3;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jarak;
        double konsumsiPerLiter = 2.0;
        double hargaBensinPerLiter = 10000.0;
        
        System.out.print("Masukkan jarak perjalanan Malang - Surabaya (km): ");
        jarak = input.nextDouble();

        
        double totalLiter = jarak / konsumsiPerLiter;
        double totalBiaya = totalLiter * hargaBensinPerLiter;

        System.out.println("\n--- Rincian Biaya Perjalanan ---");
        System.out.println("Jarak Perjalanan    : " + jarak + " km");
        System.out.println("Bensin Dibutuhkan   : " + totalLiter + " liter");
        System.out.println("Total Biaya Bensin  : Rp " +  totalBiaya);

        input.close();
    }
}