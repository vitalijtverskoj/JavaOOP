public class HotDrink extends BottleOfWater {

    private int temper;

    public HotDrink(String name, double cost, double volume, int temper) {
        super(name, cost, volume);
        this.temper = temper;
    }

    public int getTemper() {
        return temper;
    }

    public void setTemper(int temper) {
        this.temper = temper;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
               "name='" + super.getName() + '\'' +
               ", volume='" + super.getVolume() + '\'' +
               ", temper=" + this.temper + '\'' +
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

        HotDrink HotDrink = (HotDrink) obj;

        return super.getName().equalsIgnoreCase(HotDrink.getName())
                && super.getCost() == HotDrink.getCost()
                && super.getVolume() == HotDrink.getVolume()
                && getTemper() == HotDrink.getTemper();

    }
}
