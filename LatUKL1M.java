import java.util.Scanner;

public class LatUKL1M {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biayaTotal = berat * biayaPerKg;

        if (volume > 100) {
            biayaTotal += 50000;
        }

        System.out.println("\n=== RINCIAN BIAYA EKSPEDISI ===");
        System.out.println("Volume paket: " + volume + "cm³");
        System.out.println("Biaya per kg: Rp " + biayaPerKg);
        System.out.println("Biaya total pengiriman: Rp " + biayaTotal);

        input.close();
        }
    }

