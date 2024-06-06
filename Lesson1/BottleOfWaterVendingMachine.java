import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{
    private List<BottleOfWater> productList;

    public BottleOfWaterVendingMachine() {
        productList = new ArrayList<>();
    }

    public void setProductList(List<BottleOfWater> productList) {
        this.productList = productList;
    }

    public List<BottleOfWater> getProductList() {
        return productList;
    }

    public void addBottleOfWater(BottleOfWater bottleOfWater){
        this.productList.add(bottleOfWater);
    }
     
    @Override
    public Product getProduct(String name){
        for (Product product : productList) {
            if(product.getName().equals(name))
                return product;
        }
        return null;
    }

    public Product getProduct(String name, double volume) {
        for (Product product : productList) {
            if(product.getName().equals(name) && ((BottleOfWater)product).getVolume() == volume)
                return product;
        }
        return null;
    }
}
