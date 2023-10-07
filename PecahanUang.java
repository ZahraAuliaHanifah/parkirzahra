import java.util.Scanner;

public class PecahanUang {
    public static void main(String[] args) throws Exception {
        /* menghitung pecahan uang */
        System.out.print("Masukkan Jumlah uang: ");
        Scanner inputan = new Scanner(System.in);
        Double jumlah_uang = inputan.nextDouble();

        int SeratusRibu = (int)(jumlah_uang/100000);
        int Sisa = (int)(jumlah_uang%100000);
        int LimaPuluhRibu = (int)(jumlah_uang/50000);
        int Sisa2 = (int)(Sisa%50000);
        int DuaPuluhRibu = (int)(jumlah_uang/20000);
        int Sisa3 = (int)(Sisa2%20000);
        int SepuluhRibu = (int)(jumlah_uang/10000);
        int Sisa4 = (int)(Sisa3%10000);
        int LimaRibu = (int)(jumlah_uang/5000);
        int Sisa5 = (int)(Sisa4%5000);
        int DuaRibu = (int)(jumlah_uang/2000);
        int Sisa6 = (int)(Sisa5%2000);
        int Seribu = (int)(jumlah_uang/1000);
        int Sisa7 = (int)(Sisa6%1000);
        int Limaratus = (int)(jumlah_uang/500);
        int Sisa8 = (int)(Sisa7%500);
        int Seratus = (int)(jumlah_uang/100);         

        System.out.print("Jumlah Seratus Ribuan: " + SeratusRibu);
        System.out.print("Jumlah Lima Puluh Ribuan: " + LimaPuluhRibu);
        System.out.print("Jumlah Dua Puluh Ribuan: " + DuaPuluhRibu);
        System.out.print("Jumlah Seuluh Ribuan: " + SepuluhRibu);
        System.out.print("Jumlah Lima Ribuan: " + LimaRibu);
        System.out.print("Jumlah Dua Ribuan: " + DuaRibu);
        System.out.print("Jumlah Seribuan: " + Seribu);
        System.out.print("Jumlah Lima Ratusan: " + Limaratus);
        System.out.print("Jumlah Seratusan: " + Seratus);

        inputan.close();
    } 
}