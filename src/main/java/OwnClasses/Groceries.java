package OwnClasses;

import java.util.ArrayList;

/**
 * Representa un insumo, su información básica y un cálculo su precio promedio
 */

public class Groceries {

    /**
     * Nombre de un insumo
     */
    public String name;
    /**
     * Proveedor de un insumo
     */
    protected String supplier;
    /**
     * Lista de precios de un insumo
     */
    public ArrayList<Float> prices;
    /**
     * Unidad de medida de un insumo
     */
    private String measurementUnit;
    /**
     * Precio promedio de un insumo
     */
    public float averagePrice;

    /**
     * Crea una instancia de la clase Groceries
     *
     * @param name            Nombre de un insumo
     * @param supplier        Proveedor de un insumo
     * @param prices          Lista de precios de un insumo
     * @param measurementUnit Unidad de medida de un insumo
     */

    public Groceries(String name, String supplier, ArrayList<Float> prices, String measurementUnit) {
        this.name = name;
        this.supplier = supplier;
        this.prices = prices;
        this.measurementUnit = measurementUnit;
    }

    /**
     * Calcula el precio promedio de un insumo a través de una lista de precios
     *
     * @param prices Lista de precios de un insumo
     */

    public void averagePrice(ArrayList<Float> prices) {
        float add = 0;
        for (int i = 0; i < prices.size(); i++) {
            add = add + prices.get(i);
        }

        float average = add / prices.size();
        this.setAveragePrice(average);

    }

    /**
     * Obtiene el nombre de un insumo
     *
     * @return Nombre de un insumo
     */

    public String getName() {
        return name;
    }

    /**
     * Obtiene el proveedor de un insumo
     *
     * @return proveedor de un insumo
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * Obtiene la unidad de medida de un insumo
     *
     * @return Unidad de medida de un insumo
     */
    public String getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Asigna el nombre de un insumo
     *
     * @param name Nombre de un insumo
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Asigna el proveedor de un insumo
     *
     * @param supplier Proveedor de un insumo
     */

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    /**
     * Asigna la lista de precios de un insumo
     *
     * @param prices Lista de precios de un insumo
     */
    public void setPrices(ArrayList<Float> prices) {
        this.prices = prices;
    }

    /**
     * Asigna la unidad de medida de un insumo
     *
     * @param measurementUnit Unidad de media de un insumo
     */

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    /**
     * Asigna el precio promedio de un insumo
     *
     * @param averagePrice Precio promedio de un insumo
     */

    private void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }
}
