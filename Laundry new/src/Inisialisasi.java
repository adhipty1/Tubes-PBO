/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samsung blue
 */
public class Inisialisasi extends taste {
    public String nama;
     public int terima;
     public int ambil;
     public int kg;
     public int paket;
     public int harga;

    @Override
      public int getpaket() {
        return paket;
    }
    public void setpaket(int paket) {
        this.paket = paket;
    }  
    @Override
    public int getharga() {
        return harga;
    }
    public void setharga(int harga) {
        this.harga = harga;
     
    }
     @Override
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
     @Override
    public int getterima() {
        return terima;
    }
    public void setterima(int terima) {
        this.terima = terima;
    }
     @Override
    public int getambil(){
       return ambil; 
    }
    public void setambil(int ambil){
        this.ambil = ambil;
    }
     @Override
    public int getkg() {
        return kg;
    }
    public void setkg(int kg) {
        this.kg = kg;
    }
}
