
import java.util.Scanner;

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
    public int getambil() {
        return ambil;
    }

    public void setambil(int ambil) {
        this.ambil = ambil;
    }

    @Override
    public int getkg() {
        return kg;
    }

    public void setkg(int kg) {
        this.kg = kg;
    }

    public void terms() {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nama anda : ");
        nama = keyboard.nextLine();
        System.out.print("Silahkan masukkan jumlah berat cucian : ");
        kg = keyboard.nextInt();
        System.out.println("===== Silahkan pilih paket pencucian anda ==== \n");
        System.out.println("1. Reguler 3 Hari \n");
        System.out.println("2. Express 1 hari \n");
        System.out.println("3. Express 12 jam \n");
        System.out.println("4. Express 6  jam \n");
        paket = keyboard.nextInt();
        if (paket == 1) {
            harga = kg * 4000;
        } else if (paket == 2) {
            harga = kg * 7000;
        } else if (paket == 3) {
            harga = kg * 10000;
        } else if (paket == 4) {
            harga = kg * 13500;
        }
        System.out.print("Tanggal mulai mencuci : ");
        terima = keyboard.nextInt();
        System.out.print("Tanggal perkiraan selesai dicuci : ");
        ambil = keyboard.nextInt();
        setpaket(paket);
        setNama(nama);
        setambil(ambil);
        setkg(kg);
        setterima(terima);
    }
}
