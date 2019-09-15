package Model;

/**
 * Base class for factory
 * @author Elizaveta Rudko
 * @version 1.0.0
 */
public class ColdSteel {
    /**
     * Mandatory fields - title and price of cold steel
     */
    private String title = "ColdSteel";
    private  double price = 0;

    /**
     * Optional fields - signs of the weapon
     */
    private double bladeLength = -1;
    private double buttThickness = -1;
    private double bladeHardness = -1;
    private boolean safetyOfHandle = false;
    private boolean edgeSharpness = false;

    /**
     * Builder class for outer class
     */
    public static class ColdSteelBuilder
    {
        private String title = "ColdSteel";
        private  double price = 0;
        private double bladeLength = -1;
        private double buttThickness = -1;
        private double bladeHardness = -1;
        private boolean safetyOfHandle = false;
        private boolean edgeSharpness = false;

        /**
         * Constructor with only mandatory parameters
         * @param title - title
         * @param price - price
         */
        public ColdSteelBuilder(String title, double price) {
            this.title = title;
            this.price = price;
        }

        public ColdSteelBuilder setBladeLength(double bladeLength) {
            this.bladeLength = bladeLength;
            return this;
        }

        public ColdSteelBuilder setButtThickness(double buttThickness) {
            this.buttThickness = buttThickness;
            return this;
        }

        public ColdSteelBuilder setBladeHardness(double bladeHardness) {
            this.bladeHardness = bladeHardness;
            return this;
        }

        public ColdSteelBuilder setSafetyOfHandle(boolean safetyOfHandle) {
            this.safetyOfHandle = safetyOfHandle;
            return this;
        }

        public ColdSteelBuilder setEdgeSharpness(boolean edgeSharpness) {
            this.edgeSharpness = edgeSharpness;
            return this;
        }

        public ColdSteel build() {
            return new ColdSteel(this);
        }
    }

    /**
     * Constructor - creates cold steel of certain type
     * @param builder - created builder object from the nested class
     */
    protected ColdSteel(ColdSteelBuilder builder) {
        this.title = builder.title;
        this.price = builder.price;
        this.bladeLength = builder.bladeLength;
        this.buttThickness = builder.buttThickness;
        this.bladeHardness = builder.bladeHardness;
        this.safetyOfHandle = builder.safetyOfHandle;
        this.edgeSharpness = builder.edgeSharpness;
    }

    /**
     * Causes damage
     */
    public void causeDamage() {};

    /**
     * Returns title of cold steel
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public double getButtThickness() {
        return buttThickness;
    }

    public double getBladeHardness() {
        return bladeHardness;
    }

    public boolean getSafetyOfHandle() { return safetyOfHandle; }

    public boolean getEdgeSharpness() {
        return edgeSharpness;
    }

    /**
     * Method determines if the cold steel is civil
     * @return true if yes and false otherwise
     */
    public  boolean isCivilColdSteel() {
        if (bladeLength >= 0.9 && buttThickness >= 0.026 && buttThickness <= 0.06 && bladeHardness >= 42 &&
                    edgeSharpness && safetyOfHandle)
            return true;
        else return false;
    }


   /* public String toString() { // или абстрактный и в каждом определить?
        return
    }*/
}

