import java.util.Scanner;

public class HitungBiayaParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jenis kendaraan (motor/mobil)
        System.out.print("Jenis kendaraan (motor/mobil): ");
        String jenisKendaraan = input.nextLine();

        // Input jam masuk
        System.out.print("Jam masuk: ");
        int jamMasuk = input.nextInt();

        // Input jam keluar
        System.out.print("Jam keluar: ");
        int jamKeluar = input.nextInt();

        // Hitung durasi parkir
        int durasiParkir = jamKeluar - jamMasuk;

        // Tentukan tarif per jam
        int tarifPerJam;
        if (jenisKendaraan.equalsIgnoreCase("motor")) {
            tarifPerJam = 3000;
        } else if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            tarifPerJam = 5000;
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            return;
        }

        // Hitung biaya parkir
        int biayaParkir = durasiParkir * tarifPerJam;

        // Tampilkan hasil
        System.out.println("Durasi parkir: " + durasiParkir + " jam");
        System.out.println("Biaya parkir: Rp " + biayaParkir);

        input.close();
    }
}