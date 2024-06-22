package ihm;

import dao.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(); // Instanciation statique
        metier.setDao(dao); // Injection des dependances
        System.out.println("Resultat = " + metier.calculer());
    }
}
