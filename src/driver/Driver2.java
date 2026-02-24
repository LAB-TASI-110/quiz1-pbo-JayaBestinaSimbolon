// jaya bestina simbolon
// 12S24023

import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Jumlah total data
        int N = sc.nextInt();

        // 2. Deret nilai
        int[] nilai = new int[N];
        for (int i = 0; i < N; i++) {
            nilai[i] = sc.nextInt();
        }

        // 3. Kode kelompok
        int k = sc.nextInt();

        int total = 0;
        int index = 0;
        int kelompok = 1;

        // Menyusun pola rak: 1,2,3,4,...
        while (index < N) {
            if (kelompok == k) {
                for (int i = 0; i < kelompok && index < N; i++) {
                    total += nilai[index];
                    index++;
                }
                break;
            } else {
                index += kelompok;
                kelompok++;
            }
        }

        System.out.println(total);
        sc.close();
    }
}
