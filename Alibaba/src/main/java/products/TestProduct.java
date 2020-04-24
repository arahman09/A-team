package products;

import java.util.ArrayList;
import java.util.List;

public class TestProduct {

    public static List<String > getProducts(){

        List<String> productsList = new ArrayList<>();

        productsList.add("Gel pen");
        productsList.add("Air pod");
        productsList.add("Vacuum cleaner ");
        productsList.add("Table fan");
        productsList.add("Phone charger");

        return productsList;

    }
}

