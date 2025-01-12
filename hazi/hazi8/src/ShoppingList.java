import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingList {
    private List<Product> items;

    public ShoppingList() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.items.add(product);
    }

    public int countProducts() {
        return this.items.size();
    }

    public Product getProduct(int index) {
        if (index < 0 || index > this.items.size() - 1) {
            return null;
        }

        return this.items.get(index);
    }

    public void printProducts() {
        for (Product elem : items) {
            System.out.println(elem);
        }
    }

    public void delete(Product product) {
        this.items.remove(product);
    }

    public int deleteUnimportant() {
        int szaml = 0;

        //azert kell iteratorral, mert valtozhat az erteke es ha forral mennenk, akkor igy maradhatna ki
        Iterator<Product> iter = items.iterator();
        while (iter.hasNext()) {
            Product elem = iter.next();
            if (!elem.isImportant()) {
                iter.remove();
                szaml++;
            }
        }

        return szaml;
    }
}
