/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan46.TandanyaKamu;
import java.util.Scanner;
/**
 * Author
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program Tandanya Kamu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        Age objAge = new Age(2020);
        System.out.println("Masukan tahun lahir anda : ");
        objAge.setYearBirth(input.nextInt());
        System.out.print("Hari ini Tahun : ");
        objAge.getYearNow();
        System.out.println("Umur kamu sampai hari ini adalah "+ objAge.hitungUmur()+ " tahun");
        System.out.print("Tandanya kamu " );
        objAge.tandanyaKamu(objAge.hitungUmur());
    }
    
}
