import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{
        private List<Product> productList;

    public BottleOfWaterVendingMachine() {
        productList = new ArrayList<>();
    }
    
    @Override
    public void addProduct(Product product){
        productList.add(product);
    }
    
    @Override
    public void initProducts(List<Product> productList){
        this.productList = productList; 
    }
    
    @Override
    public Product getProduct(String name){
        for (Product product : productList) {
            if(product.getName().equals(name))
                return product;
        }
        return null;
    }

    public Product getProduct(String name, double value) {
        for (Product product : productList) {
            if(product.getName().equals(name) && ((BottleOfWater)product).getVolume() == value)
                return product;
        }
        return null;
    }
}
