/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10117008latihan23;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 *  Nama         : Kevin Trinanda
 * Kelas        : IF-1 V
 * NIM          : 10117008
 * Deskripsi    : Program ini akan membantu kita melihat max angka dan min angka
 */
public class PBO10117008Latihan23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int[] nilai = new int[6];
        int max,min;
        int i;
       
        for (i = 0; i<6; i++)
        {
            String bilangan = JOptionPane.showInputDialog("Masukkan Nilai: ");
            nilai[i] = Integer.parseInt(bilangan);
            System.out.println("Input Angka: "+bilangan);
        }
        
      
        min=nilai[0];
        max=nilai[0];

        for (i=0; i<6; i++){
            if(nilai[i] > max){
                max = nilai[i];   
            }
            else if(nilai[i] < min){
                min = nilai[i];    
            }    
        }
        System.out.println("--------------------------------");
        System.out.println("Nilai Max = "+max);
        System.out.println("Nilai Min = "+min);        
    }
    }
    

