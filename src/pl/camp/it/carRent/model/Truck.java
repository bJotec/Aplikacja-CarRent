package pl.camp.it.carRent.model;

public class Truck extends Vehicle{

    private int wheels;

    public Truck(String brand, String model, int year, String plate, int wheels) {
        super(brand, model, year, plate);
        this.wheels = wheels;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" MArka: ")
                .append(this.getBrand())
                .append(" Model: ")
                .append((this.getModel()))
                .append(" Rok produkcji: ")
                .append(this.getYear())
                .append(" Rejestracja: ")
                .append(this.getPlate())
                .append(" Ilosc kol ")
                .append(this.wheels);

        if (this.isRent()) {
            sb.append( " Niedostepny ");
        } else {
            sb.append( " Dostepny ");
        }

        return sb.toString();
    }

    public int getWheels() {
        return wheels;
    }
}
