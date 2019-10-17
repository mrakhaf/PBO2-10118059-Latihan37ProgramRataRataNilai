/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan37programrataratanilai;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class Mahasiswa {
    private double nilai;
    private int banyakMhs;
    
    public void setNilai(double nilai){
        this.nilai = this.nilai + nilai;
    }

    public int getBanyakMhs() {
        return banyakMhs;
    }

    public void setBanyakMhs(int banyakMhs) {
        this.banyakMhs = banyakMhs;
    }
    
    public double hitungRata(){
        return nilai/banyakMhs;
    }
    
}
