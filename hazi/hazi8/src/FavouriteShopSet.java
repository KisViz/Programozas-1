import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FavouriteShopSet {
    private Set<String> shops;

    public FavouriteShopSet() {
        this.shops = new TreeSet<>();
    }

    public void addShop(String shop) {
        this.shops.add(shop);
    }

    public int countShops() {
        return this.shops.size();
    }

    public boolean isFavourite(String shop) {
        return this.shops.contains(shop);
    }

    public void printShops() {
        Iterator<String> it = this.shops.iterator();
        while (it.hasNext()) {
            String elem = it.next();
            System.out.println(elem);
        }
    }

    public void delete(String shop) {
        this.shops.remove(shop);
    }
}
