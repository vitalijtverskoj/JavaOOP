public class BottleOfWater extends Product {

    private double volume;

    public BottleOfWater(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + super.getName() + '\'' +
                ", volume='" + this.volume + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        BottleOfWater BottleOfWater = (BottleOfWater) obj;

        return super.getName().equalsIgnoreCase(BottleOfWater.getName())
                && super.getCost() == BottleOfWater.getCost()
                && getVolume() == BottleOfWater.getVolume();

    }

}
