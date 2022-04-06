package OwnClasses;

import java.util.ArrayList;

/**
 * Representa una receta,sus ingredientes y costo de producción
 *
 * @author Miguel Ángel Molina Agudelo
 */
public class Recipe {

    /**
     * Nombre de una receta
     */
    public String name;
    /**
     * Lista de ingredientes de una receta
     */
    private ArrayList<Groceries> ingredients;
    /**
     * Costo de producción de una receta
     */
    protected float productionCost;

    /**
     * Crea una instancia de la clase Receipe
     *
     * @param name           Nombre de una receta
     * @param ingredients    Lista de ingredientes de una receta
     * @param productionCost Costo de producción de una receta
     */

    public Recipe(String name, ArrayList<Groceries> ingredients, float productionCost) {
        this.name = name;
        this.ingredients = ingredients;
        this.productionCost = productionCost;
    }

    /**
     * Obtiene el nombre de una receta almacenado en el atributo name
     *
     * @return Nombre de una receta
     */

    public String getName() {
        return name;
    }

    /**
     * Asigna el nombre a una receta almacenándolo en el atributo name
     *
     * @param name Nombre de una receta
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la lista de ingredientes de una receta almacenado en el atributo ingredients
     *
     * @return Lista de ingredientes de una receta
     */

    public ArrayList<Groceries> getIngredients() {
        return ingredients;
    }

    /**
     * Asigna una lista de ingredientes a una receta almacenándolo en el atributo ingredients
     *
     * @param ingredients Lista de ingredientes de una receta
     */

    public void setIngredients(ArrayList<Groceries> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Obtiene el costo de producción de una receta almenacenado en el atributo productionCost
     *
     * @return Costo de producción de una receta
     */
    public float getProductionCost() {
        return productionCost;
    }

    /**
     * Asigna el costo de producción de una receta almacenándolo en el atributo productionCost
     *
     * @param productionCost Costo de producción de una receta
     */

    public void setProductionCost(float productionCost) {
        this.productionCost = productionCost;
    }
}
