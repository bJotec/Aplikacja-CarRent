package pl.camp.it.carRent.model;

public class Car extends Vehicle{

    public Car(String brand, String model, int year, String plate){
        super(brand, model, year, plate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MArka: ")
                .append(this.getBrand())
                .append(" Model: ")
                .append((this.getModel()))
                .append(" Rok produkcji: ")
                .append(this.getYear())
                .append(" Rejestracja: ")
                .append(this.getPlate());

        if (this.isRent()) {
            sb.append( " Niedostepny");
        } else {
            sb.append( " Dostepny");
        }

        return sb.toString();
    }
}
