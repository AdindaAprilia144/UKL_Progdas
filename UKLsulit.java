/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsulit;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class UKLsulit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        StringBuilder elemenPositif = new StringBuilder();
        boolean adaPositif = false;
        for (int i = 0; i < n; i++) {
            
            if (arr[i] > 0) {
                if (adaPositif) {
                    elemenPositif.append(", ");
                }
                elemenPositif.append(arr[i]);
                adaPositif = true;
            }
        }

        if (adaPositif) {
            System.out.println("Array mengandung elemen positif: " + elemenPositif);
        } else {
            System.out.println("Array tidak mengandung elemen positif.");
        }
    }
}


