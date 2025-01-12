import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class BestPriceFinder {
    private Map<String, String> bestBuys;
    //     termek neve, uzlet

    public BestPriceFinder() {
        this.bestBuys = new HashMap<>();
    }

    public void addProduct(Product product, String shop) {
        this.bestBuys.put(product.getName(), shop);
    }

    public String getShopFor(String product) {
        return this.bestBuys.containsKey(product) ? this.bestBuys.get(product) : null;
    }

    public void printBestBuys() {
        Iterator it = bestBuys.entrySet().iterator();
        for (Map.Entry<String, String> elem : bestBuys.entrySet()) {
            System.out.println("Buy "+ elem.getKey() +" at "+ elem.getValue() +".");
        }

    }

    public int deleteShop(String shop) {
        int szaml = 0;

        for (Map.Entry<String, String> elem : bestBuys.entrySet()) {
            if (elem.getValue().equals(shop)) {
                bestBuys.remove(elem);
                szaml++;
            }
        }

        return szaml;
    }
}
