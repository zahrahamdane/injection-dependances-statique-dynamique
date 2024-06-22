package ihm;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        // DaoImpl2 dao = new DaoImpl2();
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine(); // Lire la premiere ligne du fichier config.txt
        Class cDao = Class.forName(daoClassName); // Charger la classe au memoire pour l'instanciation dynamique
        IDao dao = (IDao) cDao.newInstance(); // => new DaoImpl() Instanciation dynamyque via le fichier config.txt

        //MetierImpl metier = new MetierImpl();
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        // metier.setDao(dao);
        Method setDao = cMetier.getMethod("setDao", IDao.class);
        setDao.invoke(metier, dao); // Executer la methode & Injection des dependances

        System.out.println("Resultat = " + metier.calculer());

    }
}
