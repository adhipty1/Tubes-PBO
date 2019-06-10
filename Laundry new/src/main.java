/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer Swift 3
 */
public class main {
     public static void main(String[] args) {
         
        Inisialisasi i = new Inisialisasi();
        i.terms();
        System.out.println("Detail Pesanan : ");
        System.out.println("Nama : "+i.getNama());
        System.out.println("Jumlah cucian : "+i.getkg());
        System.out.println("Tanggal mulai mencuci : "+i.getterima());
        System.out.println("Tanggal perkiraan selesai : "+i.getambil());
        System.out.println("Tarif Cucian : "+i.getharga());
        System.out.println("==== Terima kasih telah menggunakan layanan kami ====");
        
        
        
    }
    
}
