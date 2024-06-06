/**
 * main
 */
public class Main {

    public static void main(String[] args) {
        HotDrink product = new HotDrink("Coffee", 150, 400, 70);
        HotDrink product1 = new HotDrink("Tea", 50, 500, 90);
        HotDrink product2 = new HotDrink("Chocolate", 100, 300, 60);
        
        HotDrinkVendingMachine vMachine = new HotDrinkVendingMachine();
        vMachine.addHotDrink(product);
        vMachine.addHotDrink(product1);
        vMachine.addHotDrink(product2);

        System.out.println(vMachine.getProduct("Coffee"));
        System.out.println(vMachine.getProduct("Tea").getCost());
        System.out.println(vMachine.getProduct("Chocolate").getVolume());

        System.out.println(product2);
        vMachine.getProduct("Chocolate").setTemper(70);
        System.out.println(product2);

    }
}