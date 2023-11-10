/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ıkilibaglilisteodevi;

/**
 *
 * @author İsmail ÖNER 02200201041
 */
public class Ogrenci {

    int ogrenciNo;
    int sinavNotu;

    public Ogrenci(int ogrenciNo, int sinavNotu) {
        this.ogrenciNo = ogrenciNo;
        this.sinavNotu = sinavNotu;
    }
    
    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public int getSinavNotu() {
        return sinavNotu;
    }

    public void setSinavNotu(int sinavNotu) {
        this.sinavNotu = sinavNotu;
    }

}
