package quizz.models.classes;

import quizz.models.enumm.JenisKendaraan;

public class Mustibisha extends Kendaraan {

    public Mustibisha(int lamaSewa) {
        super(JenisKendaraan.MUSTIBISHA, lamaSewa, 3000);
    }
    
    public double getHargaSewa() {
        return super.getHargaSewa() * super.getLamaSewa();
    }

}
