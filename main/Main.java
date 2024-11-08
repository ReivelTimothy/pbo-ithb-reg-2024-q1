package quizz.main;
import quizz.models.classes.*;
public class Main {
    public static void main(String[] args) {
       Kendaraan kendaraan = new Mustibisha(4);
       System.out.println(kendaraan.hitungBiayaSewa());
    }
}
