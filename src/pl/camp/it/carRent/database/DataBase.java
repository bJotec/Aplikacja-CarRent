package pl.camp.it.carRent.database;
import org.apache.commons.codec.digest.DigestUtils;
import pl.camp.it.carRent.authenticate.Authenticator;
import pl.camp.it.carRent.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
    private Map <String, Vehicle> vehicles = new HashMap<>();
    private List<User> users = new ArrayList<>();

    private static final DataBase instace = new DataBase();   // wzorzec singleton


    /*  private Map <String, Vehicle> vehicles = new HashMap<>();*/

    private DataBase() {
        this.vehicles.put("KR1", new Car("BMW", "2", 2010, "KR1"));
        this.vehicles.put("KR2", new Car("Mercedes", "C", 2012, "KR2"));
        this.vehicles.put("KR3", new Car("Toyota", "Corolla", 2007, "KR3"));
        this.vehicles.put("KR4", new Car("Mazda", "3", 2016, "KR4"));
        this.vehicles.put("KR5", new Car("Porsche", "Carrera", 2017, "KR5"));
        this.vehicles.put("KR6", new Bus("Solaris", "Carrera", 2013, "KR6", 50));
        this.vehicles.put("KR7", new Truck("Man", "erererra", 2017, "KR7", 5));
        this.vehicles.put("KR8", new Motor("Yamaha", "r6", 2017, "KR8", true));
        this.users.add(new User("admin",DigestUtils.md5Hex(Authenticator.MD5_SEED + "admin")));
        this.users.add(new User("user",DigestUtils.md5Hex(Authenticator.MD5_SEED + "user")));
    }


        public Vehicle findNotRentVehicleByPlate(String plate) {               // metoda opis :    co metoda zwraca - nazwe metody - przyjmuje parametry
            Vehicle vehicle = this.vehicles.get(plate);
            if(vehicle == null || vehicle.isRent()) {
                return null;
            } else {
                return vehicle;
            }
        }

        public Vehicle findRentVehicleByPlate(String plate) {
            Vehicle vehicle = this.vehicles.get(plate);
            if(vehicle == null || !vehicle.isRent()) {
                return null;
            } else {
                return vehicle;
            }
        }

   /*     private Vehicle findVehicleByPlate(String plate) {
            for(Vehicle vehicle : this.vehicles) {
                if(vehicle.getPlate().equals(plate)) {
                    return vehicle;
                }
            }
            return null;
        }
*/
        public Map<String, Vehicle> getVehicles() {
            return vehicles;
        }

        public User getUserByLogin (String login) {
            for (User user:this.users){
                if ( user.getLogin().equals(login)){
                    return user;
                }
            }

            return  null;
        }


        public static DataBase getInstace() {
            return instace;
        }
    }
