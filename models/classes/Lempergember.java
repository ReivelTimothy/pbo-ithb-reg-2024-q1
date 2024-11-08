package quizz.models.classes;

import quizz.models.enumm.*;

public class Lempergember extends Kendaraan {
    private KategoriSupir kategoriSupir; // katergori supir yang ada
    private double biayaJasa; // apabila ingin menerima jasa pengiriman ke rumah
    private double biayaSupir;

    public Lempergember(JenisKendaraan jenisKendaraan, int lamaSewa, double hargaSewa) {
        super(JenisKendaraan.LEMPERGEMBER, lamaSewa, 5000);
        this.biayaJasa = 0;
        this.biayaSupir = 0;

    }

    public double getHargaSewa() {
        return super.getHargaSewa();
    }

    public void TambahanBiayaSupir() { // method ini harus dikerjakan duluan sebelum tambahanBiayaPengiriman
        if (getKategoriSupir().equals(KategoriSupir.BIASA)) {
            this.biayaSupir = getHargaSewa() + (getHargaSewa() * 0.07);
        } else {
            this.biayaSupir = getHargaSewa() + (getHargaSewa() * 0.03);
        }
    }

    public KategoriSupir getKategoriSupir() {
        return kategoriSupir;
    }

    public void setKategoriSupir(KategoriSupir kategoriSupir) {
        this.kategoriSupir = kategoriSupir;
    }

    public double getTerimaJasa() {
        return biayaJasa;
    }

    public void setTerimaJasa(double biayaJasa) {
        this.biayaJasa = biayaJasa;
    }

    public double getBiayaSupir() {
        return biayaSupir;
    }

    public void setBiayaSupir(double biayaSupir) {
        this.biayaSupir = biayaSupir;
    }

}
