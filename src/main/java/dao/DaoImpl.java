package dao;

import org.springframework.stereotype.Component;

@Component("vbd")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version base de donnees");
        double data = 34;
        return data;
    }
}
