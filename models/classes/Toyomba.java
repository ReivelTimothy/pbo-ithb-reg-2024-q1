package quizz.models.classes;

import quizz.models.enumm.JenisKendaraan;

public class Toyomba extends Kendaraan {
    private double banSerep; // apabila ingin menambah ban serep
    private double tambahHargaSewa; // apabila toyomba ingin menambah harga sewa yang ada
    private double diskon; // untuk set diskon yang ada

    public Toyomba(int lamaSewa) {
        super(JenisKendaraan.TOYOMBA, lamaSewa, 4500);
    }

    @Override
    public double hitungBiayaSewa() {
        return this.banSerep + this.tambahHargaSewa + getHargaSewa() - this.diskon;
    }

    public double getDiskon() {
        return diskon;
    }

    public double getBanSerep() {
        return banSerep;
    }

    public void setBanSerep(double banSerep) {
        this.banSerep = banSerep;
    }

    public double getTambahHargaSewa() {
        return tambahHargaSewa;
    }

    public void setTambahHargaSewa(double tambahHargaSewa) {
        this.tambahHargaSewa = tambahHargaSewa;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

}
