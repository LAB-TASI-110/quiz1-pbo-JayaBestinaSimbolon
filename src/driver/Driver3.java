// jaya bestina simbolon
// 12S24023

import java.util.Scanner;

class Pengaduan {
    String nama;
    int angkatan;
    String asrama;
    String jenis;
    String detail;

    public Pengaduan(String nama, int angkatan, String asrama, String jenis, String detail) {
        this.nama = nama;
        this.angkatan = angkatan;
        this.asrama = asrama;
        this.jenis = jenis;
        this.detail = detail;
    }

    public void tampilkanData() {
        System.out.println("\n===== DATA PENGADUAN =====");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Angkatan       : " + angkatan);
        System.out.println("Asrama         : " + asrama);
        System.out.println("Jenis Laporan  : " + jenis);
        System.out.println("Detail         : " + detail);
        System.out.println("Status         : Laporan Diterima");
    }

    public void responLaundry() {
        System.out.println("\n===== RESPON PIHAK LAUNDRY =====");

        if (jenis.equals("Baju Rusak")) {
            System.out.println("Kami mohon maaf atas kerusakan pakaian Anda.");
            System.out.println("Kami akan melakukan pengecekan dan proses tindak lanjut.");
        } 
        else if (jenis.equals("Baju Hilang")) {
            System.out.println("Kami mohon maaf atas kehilangan pakaian Anda.");
            System.out.println("Kami akan melakukan pencarian dan investigasi lebih lanjut.");
        } 
        else {
            System.out.println("Laporan sedang diproses.");
        }

        System.out.println("Terima kasih telah melapor ke Laundry Del.");
    }
}

// Class utama
public class Driver3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== SISTEM PENGADUAN LAUNDRY DEL =====\n");

        // Input data mahasiswa
        System.out.print("Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Angkatan       : ");
        int angkatan = input.nextInt();
        input.nextLine(); 

        System.out.print("Nama Asrama    : ");
        String asrama = input.nextLine();

        // Pilih jenis pengaduan
        System.out.println("\nJenis Pengaduan:");
        System.out.println("1. Baju Rusak");
        System.out.println("2. Baju Hilang");
        System.out.print("Pilih (1/2): ");
        int pilih = input.nextInt();
        input.nextLine();

        String jenis;

        if (pilih == 1) {
            jenis = "Baju Rusak";
        } else if (pilih == 2) {
            jenis = "Baju Hilang";
        } else {
            System.out.println("Pilihan tidak valid.");
            input.close();
            return;
        }

        // Input detail laporan
        System.out.print("Detail Kejadian : ");
        String detail = input.nextLine();

        // Membuat objek pengaduan
        Pengaduan laporan = new Pengaduan(nama, angkatan, asrama, jenis, detail);

        // Menampilkan data dan respon
        laporan.tampilkanData();
        laporan.responLaundry();

        input.close();
    }
}
