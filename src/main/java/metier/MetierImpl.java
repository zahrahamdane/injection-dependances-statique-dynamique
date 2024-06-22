package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao; // Couplage Faible

    @Override
    public double calculer() {
        double data = dao.getData();
        double result = data * 11.4;
        return result;
    }

    /**
     * Pour permettre d'injecter dans la variable dao
     * un objet d'une classe qui implemente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
