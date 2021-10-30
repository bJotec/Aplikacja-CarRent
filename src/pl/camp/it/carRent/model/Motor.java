package pl.camp.it.carRent.model;

public class Motor extends Vehicle{

    boolean additionalSeat;

    public boolean isAdditionalSeat() {
        return additionalSeat;
    }

    public Motor(String brand, String model, int year, String plate, boolean additionalSeat) {
        super(brand, model, year, plate);
        this.additionalSeat = additionalSeat;
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
                .append(this.getPlate())
                .append(" siedzenie ")
                .append((this.additionalSeat));

        if (this.isRent()) {
            sb.append( " Niedostepny");
        } else {
            sb.append( " Dostepny");
        }

        return sb.toString();
    }
}
