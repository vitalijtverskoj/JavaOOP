import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrink> productList;

    public HotDrinkVendingMachine() {
        productList = new ArrayList<>();
    }

    public void setProductList(List<HotDrink> productList) {
        this.productList = productList;
    }

    public List<HotDrink> getProductList() {
        return productList;
    }

    public void addHotDrink(HotDrink hotDrink) {
        this.productList.add(hotDrink);
    }

    @Override
    public HotDrink getProduct(String name){
        for (HotDrink product : productList) {
            if(product.getName().equals(name))
                return product;
        }
        return null;
    }

    public HotDrink getProduct(String name, double volume, int temper) {
        for (HotDrink product : productList) {
            if(product.getName().equals(name) && ((HotDrink)product).getVolume() == volume && ((HotDrink)product).getTemper() == temper)
                return product;
        }
        return null;
    }
}
