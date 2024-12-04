/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsedang;

/**
 *
 * @author LENOVO
 */
public class UKLsedang {

    public static void main(String[] args) {
         int tabunganBulanPertama = 100000; 
         int totalTabungan = 0; 
        int tabunganBulanan = tabunganBulanPertama; 

        for (int bulan = 1; bulan <= 24; bulan++) {
            totalTabungan += tabunganBulanan;
                  System.out.println("Bulan " + bulan + ": Rp " + tabunganBulanan);
            tabunganBulanan += 20000;
        }
        System.out.println("\nTotal tabungan selama 24 bulan: Rp " + totalTabungan);
    }
}

    


