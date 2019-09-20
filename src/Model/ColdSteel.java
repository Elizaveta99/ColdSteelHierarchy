package Model;

import java.util.Objects;

/**
 * Base class for factory
 * @author Elizaveta Rudko
 * @version 1.0.0
 */
public abstract class ColdSteel {
    /**
     * Common fields - type, title and price of cold steel
     */
    private String type = "ColdSteel";
    private String title = "ColdSteel";
    private  double price = 0;

    /**
     * Constructor with only mandatory parameters
     * @param type - type
     * @param title - title
     * @param price - price
     */
    public ColdSteel(String type, String title, double price)
    {
        this.type = type;
        this.title = title;
        this.price = price;
    }

    /**
     * Causes damage
     */
    public abstract void causeDamage();
   /* {
        System.out.println("Applying damage from cold steel");
    };*/

    public void isCivilColdSteel()
    {
        System.out.println(this.getTitle() + " is not a civil cold steel");
    }

    /**
     * Returns type of cold steel
     * @return type
     */
    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColdSteel)) return false;
        ColdSteel coldSteel = (ColdSteel) o;
        return Double.compare(coldSteel.getPrice(), getPrice()) == 0 &&
                Objects.equals(getType(), coldSteel.getType()) &&
                Objects.equals(getTitle(), coldSteel.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getTitle(), getPrice());
    }

    @Override
    public String toString() {
        return "ColdSteel: " +
                "type = " + type +
                ", title = " + title +
                ", price = " + price;
    }
}

