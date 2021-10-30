package pl.camp.it.carRent;

import pl.camp.it.carRent.database.DataBase;
import pl.camp.it.carRent.model.Bus;
import pl.camp.it.carRent.model.Car;
import pl.camp.it.carRent.gui.GUI;
import pl.camp.it.carRent.model.Truck;
import pl.camp.it.carRent.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        DataBase database = new DataBase();


        while (true) {
            GUI.showMenu();

            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String choose = reader.readLine();



            switch (choose) {
                case "1":
                    for (Vehicle vehicle : database.getVehicles().values()) {
                        System.out.println(vehicle);
            /*            if (vehicle instanceof Car) {
                            gui.printCar((Car) vehicle);
                        } else if (vehicle instanceof Bus) {
                            gui.printBus((Bus) vehicle);
                          } else if (vehicle instanceof Truck) {
                    gui.printTruck((Truck) vehicle);
                } */

                    }
                        /*System.out.println(car.brand + " " + car.pl.camp.it.carRent.model + " rok: " + car.year + " numer rejestracyjny: " + car.plate);
                        if (car.rent) {
                            System.out.print(" status:  wypożyczony");
                        } else {
                            System.out.print(" status: wolny");
                        }
                        System.out.println();*/

            break;
            case "2":
                System.out.println("Podaj numer rejestracyjny: ");

                Vehicle vehicle = database.findNotRentVehicleByPlate(reader.readLine());
                if (vehicle == null) {
                    System.out.println("Nie ma takiego auta");
                } else {
                    vehicle.setRent(true);
                    System.out.println(" Wypozyczono samochód");
                }

                    /*boolean rentSuccess = false;
                    for (pl.camp.it.carRent.model.Car car : pl.camp.it.carRent.database.cars) {
                        if (car.plate.equals(plate) && !car.rent) {
                            System.out.println(" Wypożyczono samochod");
                            car.rent = true;
                            rentSuccess = true;
                            break;
                        }

                    }
                    if (!rentSuccess) {
                        System.out.println(" Auto jest juz wypozyczone lub nie ma takiego auta");
                    }*/
                break;
            case "3":
                System.exit(0);   // 0 to kod błedu który mówi ze nie bylo błędu
                break;
            case "4":
                System.out.println("Podaj numer rejestracyjny: ");
                Vehicle vehicle2 = database.findRentVehicleByPlate(reader.readLine());
                if (vehicle2 == null) {
                    System.out.println("Nie ma takiego auta");
                } else {
                    vehicle2.setRent(false);
                    System.out.println("oddano");
                }
                break;
            default:
                System.out.println("Nieprawidłowy wybór");

                /*            boolean returnSuccess = false;
                             for (pl.camp.it.carRent.model.Car car : pl.camp.it.carRent.database.cars) {
                              if (car.plate.equals(plate) && car.rent) {
                            System.out.println(" Oddano samochod");
                            car.rent = false;
                            returnSuccess = true;
                            break;
                        }

                    }
                    if (!returnSuccess) {
                        System.out.println(" Nie ma takiego auta lub nie jest wypozyczone");
                    }
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór");*/
        }
            }

        }
    }


