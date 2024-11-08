package quizz.controller;
import quizz.models.classes.*;
import quizz.models.enumm.*;
public class Controller {
    public double diskonToyomba(int lamaSewa) { // untuk diskon sesuai lama sewa
        if (lamaSewa > 5) {
            return 0.07;
        } else {
            return 0;
        }
    }
    
    public double tambahanBanSerep(boolean cek, double hargaSewa){ // untuk penambahan ban serep
        if (cek) {
            return hargaSewa- (hargaSewa * 0.03);
        } else {
            return 0;
        }
    }

    public double tambahHargaSewa(boolean cek, double hargaSewa){ // untuk penambahan biaya dari toyomba nya sendiri
        if (cek) {
            return hargaSewa + (hargaSewa * 0.08);
        } 
        return 0;
    }
    public double TambahanBiayaPengiriman(boolean cek, int lamaSewa){
        if (cek ) {
            if (lamaSewa > 5) {
                return 0;
            } else {
                return 300;
            }
        }
        return 0;
    }
}
