// jaya bestina simbolon
// 12S24023

import java.util.*;

public class Driver1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Data Menu
        String[] kode = {"NGS","AP","SA","BU","MAP","GG","SAM","RD","IB","NUK"};
        String[] nama = {
                "Nasi Goreng Spesial",
                "Ayam Penyet",
                "Sate Ayam (10 Tusuk)",
                "Bakso Urat",
                "Mie Ayam Pangsit",
                "Gado-Gado",
                "Soto Ayam",
                "Rendang Daging",
                "Ikan Bakar",
                "Nasi Uduk Komplit"
        };

        int[] harga = {
                15000, 20000, 25000, 18000, 15000,
                15000, 17000, 25000, 35000, 20000
        };

        int totalBelanja = 0;

        // Untuk menyimpan struk
        List<String> listMenu = new ArrayList<>();
        List<Integer> listPorsi = new ArrayList<>();
        List<Integer> listHarga = new ArrayList<>();
        List<Integer> listTotal = new ArrayList<>();

        while (true) {

            String inputKode = input.next();

            if (inputKode.equalsIgnoreCase("END")) {
                break;
            }

            int porsi = input.nextInt();

            boolean ditemukan = false;

            for (int i = 0; i < kode.length; i++) {

                if (inputKode.equalsIgnoreCase(kode[i])) {

                    int subtotal = harga[i] * porsi;
                    totalBelanja += subtotal;

                    listMenu.add(nama[i]);
                    listPorsi.add(porsi);
                    listHarga.add(harga[i]);
                    listTotal.add(subtotal);

                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Kode tidak ditemukan!");
            }
        }

        // =============================
        // CETAK STRUK
        // =============================

        System.out.println("\n==============================================");
        System.out.printf("%-25s %-6s %-8s %-10s\n",
                "Menu", "Porsi", "Harga", "Total");
        System.out.println("==============================================");

        for (int i = 0; i < listMenu.size(); i++) {
            System.out.printf("%-25s %-6d %-8d %-10d\n",
                    listMenu.get(i),
                    listPorsi.get(i),
                    listHarga.get(i),
                    listTotal.get(i));
        }

        System.out.println("==============================================");

        // HITUNG DISKON
        double diskon = 0;
        String kupon = "Tidak Ada";

        if (totalBelanja >= 500000) {
            diskon = 0.25;
            kupon = "Kupon Hitam (25%)";
        } else if (totalBelanja >= 400000) {
            diskon = 0.20;
            kupon = "Kupon Hijau (20%)";
        } else if (totalBelanja >= 300000) {
            diskon = 0.15;
            kupon = "Kupon Merah (15%)";
        } else if (totalBelanja >= 200000) {
            diskon = 0.10;
            kupon = "Kupon Kuning (10%)";
        } else if (totalBelanja >= 100000) {
            diskon = 0.05;
            kupon = "Kupon Biru (5%)";
        }

        int potongan = (int)(totalBelanja * diskon);
        int totalBayar = totalBelanja - potongan;

        System.out.printf("%-40s %d\n", "Total Pembayaran", totalBelanja);
        System.out.printf("%-40s %s\n", "Kupon Didapat", kupon);
        System.out.printf("%-40s %d\n", "Diskon", potongan);
        System.out.printf("%-40s %d\n", "Total Bayar", totalBayar);
        System.out.println("==============================================");

        input.close();
    }
}
