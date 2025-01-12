import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtremeShopping {
    private Map<String, List<Product>> extremeList;
            //  bolt neve, lista

    public ExtremeShopping() {
        this.extremeList = new HashMap<>();
    }

    public void addShoppingList(String shop, List<Product> productList) {
        this.extremeList.put(shop, productList);
    }

    public void printShoppingLists() {
        for (Map.Entry<String, List<Product>> elem : extremeList.entrySet()) {
            System.out.println(elem.getKey());

            List<Product> termekLista = elem.getValue();
            for (int i = 0; i < termekLista.size(); i++) {
                System.out.print(termekLista.get(i).getName());
                if (i < termekLista.size() - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }
}
