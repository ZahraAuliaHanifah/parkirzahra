import java.util.Scanner;
public class Discount {
    public static void main(String[] args) throws Exception {
        Double totalBelanja, Discount;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan total belanja: ");
        totalBelanja = inputan.nextDouble();

        if (totalBelanja >= 1000000) {
            Discount = 5 * totalBelanja/100;
            totalBelanja = totalBelanja - Discount;
        }

        System.out.print("Total yang harus dibayar: " + totalBelanja);
        inputan.close();
    }
}
