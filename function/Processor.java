package udemy.composition.function;

public class Processor {

    private String brand;
    private int series;
    private String newBrand;
    private String oldBrand;

    public Processor() {
    }

    public Processor(String brand, int series, String newBrand, String oldBrand) {
        this.brand = brand;
        this.series = series;
        this.newBrand = newBrand;
        this.oldBrand = oldBrand;

    }

    public String getBrand() {
        return brand;
    }

    public int getSeries() {
        return series;
    }

    public String getNewBrand() {
        return newBrand;
    }

    public String getoldBrand() {
        return oldBrand;
    }

    public void setoldBrand() {
        this.oldBrand = oldBrand;
    }

    public void setNewBrand(String newBrand) {
        this.newBrand = newBrand;
    }

    @Override
    public String toString() {
        return "Processor{" + "brand=" + brand + ", series=" + series + ", newBrand=" + newBrand + ", oldBrand=" + oldBrand + '}';
    }

}
