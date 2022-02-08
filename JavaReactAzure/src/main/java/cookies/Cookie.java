package cookies;

public class Cookie extends Object {

    private int numChips;
    private double grams;
    private String type;
    public boolean edible;

    public Cookie() {

    }

    public int getNumChips() {
        return numChips;
    }

    public void setNumChips(int numChips) {
        this.numChips = numChips;
    }

    public double getGrams() {
        return grams;
    }

    public void setGrams(double grams) {
        this.grams = grams;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }

    public Cookie(String type) {
        this.type = type;
    }

    public Cookie(String type, double grams) {
        this.type = type;
        this.grams = grams;
    }


    public String toString() {
        return type;
    }
}
