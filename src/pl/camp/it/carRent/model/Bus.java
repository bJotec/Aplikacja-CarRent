package pl.camp.it.carRent.model;

public class Bus extends Vehicle {


    private int passangers;

    public Bus(String brand, String model, int year, String plate, int passangers){
      super(brand, model, year, plate);
      this.passangers = passangers;
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
                .append(" Lioczba pasazerów")
                .append(this.passangers);

        if (this.isRent()) {
            sb.append( "Niedostepny");
        } else {
            sb.append( " Dostepny");
        }

        return sb.toString();
    }


    public int getPassangers() {
        return passangers;
    }


}
