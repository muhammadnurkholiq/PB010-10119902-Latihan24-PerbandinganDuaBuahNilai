/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 * 
 * @author
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF-10K
 * NIM      : 10119902
 * Deskripsi Program : Program ini berisi program untuk Menghitung Perbandingan Dua Buah Nilai  
 * 
 */

public class PB01010119902Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int nilaiPertama = 0, nilaiKedua = 0;
        String aktivitas;

        System.out.println("========Program Perbandingan Nilai========");
        
        do 
        {
            System.out.print("Masukkan nilai pertama : ");
            nilaiPertama = scanner.nextInt();

            System.out.print("Masukkan nilai kedua : ");
            nilaiKedua = scanner.nextInt();

            System.out.print("Hasil : ");
            if (nilaiPertama > nilaiKedua) 
            {
                System.out.println(nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } 
            else if (nilaiPertama < nilaiKedua) 
            {
                System.out.println(nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } 
            else 
            {
                System.out.println(nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
            aktivitas = scanner.next();
            aktivitas = aktivitas.toLowerCase();
            System.out.println();
        } 
        while (aktivitas.equals("ya"));
    }
    
}
