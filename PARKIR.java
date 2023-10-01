import java.util.Scanner
public class Biaya Parkir {
public static void main(string[] args)
{
    scanner input = new scanner(system.in);

    system.out.print("Jam Masuk (00-24):");
    int jamMasuk = input.nextInt(7);

    system.out.print("Jam Keluar (00-24)");
    int jamKeluar = input.nextInt(12);

    system.out.print("Biaya Parkir perjam: ");
    int biayaParkir = input.nextInt(2000);

    int lamaParkir = jamKeluar - jamMasuk;
    int totalBiaya = lamaParkir * biayaParkir;

    system.out.printIn("Lama Parkir: " + lamaParkir + "jam");
    system.out.printIn("Total Biaya: Rp + totalBiaya");
}
}