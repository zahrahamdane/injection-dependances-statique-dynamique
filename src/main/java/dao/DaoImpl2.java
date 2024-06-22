package dao;

import org.springframework.stereotype.Component;

@Component("vws")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web service");
        double data = 55;
        return data;
    }
}
