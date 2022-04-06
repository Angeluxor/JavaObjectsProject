package ExampleClasses;

import java.util.ArrayList;

/**
 * Representa una fruta con información básica sobre la misma
 *
 * @author Miguel Ángel Molina
 */
public class Fruit {

    /**
     * Nombre de una fruta
     */
    public String name;
    /**
     * Peso promedio de una fruta
     */
    private final float averageWeight;

    /**
     * Crea una instancia de la clase Fruit
     *
     * @param name          Nombre de una fruta
     * @param averageWeight Peso promedio de una fruta
     * @param colors        Color de una fruta
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Lista de colores de una fruta
     */


    public ArrayList<String> colors;


    /**
     * Obtiene la lista de colores de una fruta
     *
     * @return Una lista de colores de una fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Asigna una lista de colores a una fruta
     *
     * @param colors Una lista de colores de una fruta
     */

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
