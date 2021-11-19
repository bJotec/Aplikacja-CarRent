package pl.camp.it.carRent.authenticate;

import org.apache.commons.codec.digest.DigestUtils;
import pl.camp.it.carRent.database.DataBase;
import pl.camp.it.carRent.gui.GUI;
import pl.camp.it.carRent.model.User;

public class Authenticator {

    public static final String MD5_SEED = "Gd5xAm9OepHO5A1WnYN1IScrSbHgDiRK" ;

    private static final Authenticator instance = new Authenticator();

    private Authenticator(){
    }

    public static boolean authenticate (String login, String password/*, DataBase dataBase*/) {

        DataBase dataBase = DataBase.getInstace();
        User user = dataBase.getUserByLogin(login);
        return user != null && user.getPassword().equals(DigestUtils.md5Hex(MD5_SEED + password));

        /*
        if (user != null && user.getPassword().equals(password)) {          // && leniwy sposob , & sprawdza obydwa warunki zawszę ...
            return true;
        }
        else {
            return false;
        }*/
    }

    public static Authenticator getInstance(){
        return instance;
    }
}
