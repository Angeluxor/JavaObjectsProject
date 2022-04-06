package OwnClasses;

import java.util.ArrayList;

public class Groceries extends Supplies {

    public String name;
    protected String supplier;
    private ArrayList<Float> prices;
    private String measurementUnit;
    public float averagePrice;

    public Groceries(String name, String supplier, ArrayList<Float> prices, String measurementUnit) {
        this.name = name;
        this.supplier = supplier;
        this.prices = prices;
        this.measurementUnit = measurementUnit;
    }

    @Override
    public void averagePrice(ArrayList<Float> prices) {
        float add = 0;
        for (int i = 0; i < prices.size(); i++){
            add = add + prices.get(i);
        }

        float average = add/prices.size();
        this.setAveragePrice(average);

    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setPrices(ArrayList<Float> prices) {
        this.prices = prices;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }
}
