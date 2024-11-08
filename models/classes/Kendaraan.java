package quizz.models.classes;

import quizz.models.enumm.*;

public abstract class Kendaraan implements HitungBiayaSewa {
    private JenisKendaraan jenisKendaraan;
    private int lamaSewa;
    private double hargaSewa;

    public Kendaraan(JenisKendaraan jenisKendaraan, int lamaSewa, double hargaSewa) {
        this.jenisKendaraan = jenisKendaraan;
        this.lamaSewa = lamaSewa;
        this.hargaSewa = hargaSewa;
    }

    public JenisKendaraan getJenisKendaraan() {
        return jenisKendaraan;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setJenisKendaraan(JenisKendaraan jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    @Override
    public double hitungBiayaSewa() {
        return 0;
    }

}
