package week3;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double hargaMotor;
        double uangMuka;
        int lamaCicilan;

        System.out.print("Masukkan harga motor : ");
        hargaMotor = input.nextDouble();
        System.out.print("Masukkan uang muka (DP) : ");
        uangMuka = input.nextDouble();
        System.out.print("Masukkan durasi (bulan) : ");
        lamaCicilan = input.nextInt();

        double sisaUtang = hargaMotor - uangMuka;
        double cicilanPokok = sisaUtang / lamaCicilan;
        double bunga = 0.01 * sisaUtang;
        double totalCicilanBulanan = cicilanPokok + bunga;

        System.out.println("\n ====== Detail Pembayaran Kredit =====");
        System.out.println("Sisa Utang Pokok : Rp " + sisaUtang);
        System.out.println("Cicilan Pokok Bulanan : Rp " + cicilanPokok);
        System.out.println("Bunga Bulanan (1%) : Rp " + bunga);
        System.out.println(" Total Cicilan Bulanan : Rp " + totalCicilanBulanan);

        input.close();
    }
}