package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("vbd")
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
