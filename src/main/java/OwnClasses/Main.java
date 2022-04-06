package OwnClasses;

import java.util.ArrayList;
import java.util.Scanner;

 class Main {


    public static ArrayList<Groceries> groceriesList = new ArrayList<>();

    void start (){

        Scanner newGrocery = new Scanner(System.in);
        System.out.println("Ingrese, por favor, el nombre del producto");
        String name = newGrocery.nextLine();
        System.out.println("Ingrese, por favor, el nombre del proveedor");
        String supplier = newGrocery.nextLine();
        System.out.println("Ingrese, por favor, el valor de compra más reciente");
        String stringPrice = newGrocery.nextLine();
        Float price = Float.valueOf(stringPrice);
        ArrayList<Float> prices = new ArrayList<Float>();
        prices.add(price);
        System.out.println("Ingrese, por favor, la unidad de medida del producto");
        String measurementUnit = newGrocery.nextLine();

        Groceries grocery = new Groceries(name,supplier,prices,measurementUnit);
        grocery.averagePrice(prices);
        groceriesList.add(grocery);
        System.out.println("grocery = " + grocery);
    }

    public static void main(String[] args) {

        new Main().start();
    }

}
