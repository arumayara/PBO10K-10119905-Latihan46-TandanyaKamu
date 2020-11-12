/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan46.TandanyaKamu;

/**
 *
 * @author aruma
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private static String red = "\u001b[31m";
    
    public Age(int yearNow){
        this.yearNow=yearNow;
        
    }
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth=yearBirth;
    }
    
    public int getYearNow(){
        System.out.println(yearNow);
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow-yearBirth;
    }
    
    public String tandanyaKamu(int umur){
       
        if (umur>0 && umur<=5){ 
            System.out.println("Lagi lucu-lucunya");
        } else if (umur>5 && umur<=10){
            System.out.println(red+"Masih anak-anak");
        } else if (umur>10 && umur<=13){
            System.out.println(red+"Masih Remaja");
        } else if (umur>13 && umur<=19){
            System.out.println(red+"Alay");
        } else if (umur>19 && umur<=29){
            System.out.println(red+"Lagi galau nyari jodoh");
        } else if (umur>29 && umur<=35){
            System.out.println(red+"Lagi sibuk cari uang");
        } else if (umur>35 && umur<=150){
            System.out.println(red+"Sudah tua");
        } else{
            System.out.println(red+"Tidak Terdeteksi di Kehidupan");
        }
        return "null";  
}
}
