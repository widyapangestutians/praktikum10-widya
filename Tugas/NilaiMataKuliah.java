/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum10.Tugas;

/**
 *
 * @author widya
 */
public class NilaiMataKuliah extends MataKuliah {
    Double bobot_uts;
    Double bobot_uas;
    Double bobot_lain2;
    Double nilai_uts;
    Double nilai_uas;
    Double nilai_lain2;
    Double nilai_akhir;
    String Grade;
    
    public double hitungNilai(){
        
        return nilai_akhir;
    }
    
    public void hitungGrade(){
        if(nilai_akhir<=100 || nilai_akhir>=80 ){
            System.out.println("Grade A");
        }else if(nilai_akhir<80 || nilai_akhir>=75){
            System.out.println("Grade AB");
        }else if(nilai_akhir<75 || nilai_akhir>=70){
            System.out.println("Grade B");
        }else if(nilai_akhir<70 || nilai_akhir>=65){
            System.out.println("Grade BC");
        }else if(nilai_akhir<65 || nilai_akhir>=60){
            System.out.println("Grade C");
        }else if(nilai_akhir<60 || nilai_akhir>=55){
            System.out.println("Grade CD");
        }else if(nilai_akhir<55 || nilai_akhir>=50){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade E");
        }
    }
    
}
