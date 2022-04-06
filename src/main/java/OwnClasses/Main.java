package OwnClasses;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

    /**
     * Crea una instancia de la clase ArrayList que contendrá una lista de objetos de la clase Groceries
     */

    public static ArrayList<Groceries> groceriesList = new ArrayList<>();

    /**
     * Solicita la información al usuario a través de la consola para la creación de una nueva instancia de la clase Groceries y añada esta instancia a una lista
     *
     * @author Miguel Ángel Molina
     */

    void start() {

        Scanner newGrocery = new Scanner(System.in);
        System.out.println("Ingrese, por favor, el nombre del producto");
        String name = newGrocery.nextLine();
        System.out.println("Ingrese, por favor, el nombre del proveedor");
        String supplier = newGrocery.nextLine();
        System.out.println("Ingrese, por favor, el valor de compra más reciente");
        String stringPrice = newGrocery.nextLine();
        Float price = Float.valueOf(stringPrice);
        ArrayList<Float> prices = new ArrayList<>();
        prices.add(price);
        System.out.println("Ingrese, por favor, la unidad de medida del producto");
        String measurementUnit = newGrocery.nextLine();

        Groceries grocery = new Groceries(name, supplier, prices, measurementUnit);
        grocery.averagePrice(prices);
        groceriesList.add(grocery);
    }

    public static void main(String[] args) {

        new Main().start();
    }

}
