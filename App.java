import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nominal, sisa, lembar50rb, lembar20rb, lembar10rb, lembar5rb, lembar2rb, lembar1rb, keping500;

        System.out.print("Masukkan nominal: ");
        nominal = input.nextInt();

        // Menghitung lembar uang kertas dan keping uang logam
        lembar50rb = nominal / 50000;
        sisa = nominal % 50000;
        lembar20rb = sisa / 20000;
        sisa = sisa % 20000;
        lembar10rb = sisa / 10000;
        sisa = sisa % 10000;
        lembar5rb = sisa / 5000;
        sisa = sisa % 5000;
        lembar2rb = sisa / 2000;
        sisa = sisa % 2000;
        lembar1rb = sisa / 1000;
        sisa = sisa % 1000;
        keping500 = sisa / 500;

        // Menampilkan hasil perhitungan
        System.out.println(lembar50rb + " lembar 50 ribuan");
        System.out.println(lembar20rb + " lembar 20 ribuan");
        System.out.println(lembar10rb + " lembar 10 ribuan");
        System.out.println(lembar5rb + " lembar 5 ribuan");
        System.out.println(lembar2rb + " lembar 2 ribuan");
        System.out.println(lembar1rb + " lembar 1 ribuan");
        System.out.println(keping500 + " keping 500an");
    }
}