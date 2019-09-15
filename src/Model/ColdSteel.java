package Model;

/**
 * Base class for factory
 * @author Elizaveta Rudko
 * @version 1.0.0
 */
public class ColdSteel {
    /**
     * Field - title of cold steel
     */
    private String title = "ColdSteel";

    /**
     * Field - type of cold steel
     */
    //private String type = "coldsteel";

    /*private boolean hasBlade = true;
    private boolean hasEdge = true;
    private boolean hasButt = true;
    private boolean hasHandle = true;*/

    /**
     * Fields - signs of the weapon
     */
    private double bladeLength = -1;
    private double buttThickness = -1;
    private double bladeHardness = -1;
    private boolean safetyOfHandle = false;
    private boolean edgeSharpness = false;

    /**
     * Builder class for outer class
     */
    public static class ColdSteelBuilder {
        private String title = "ColdSteel";
        //private String type = "coldsteel";
        /*private boolean hasBlade = true;
        private boolean hasEdge = true;
        private boolean hasButt = true;
        private boolean hasHandle = true;*/
        private double bladeLength = -1;
        private double buttThickness = -1;
        private double bladeHardness = -1;
        private boolean safetyOfHandle = false;
        private boolean edgeSharpness = false;

        public ColdSteelBuilder(String title) {
            this.title = title;
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
    private ColdSteel(ColdSteelBuilder builder) {
        this.title = builder.title;
        this.bladeLength = builder.bladeLength;
        this.buttThickness = builder.buttThickness;
        this.bladeHardness = builder.bladeHardness;
        this.safetyOfHandle = builder.safetyOfHandle;
        this.edgeSharpness = builder.edgeSharpness;
    }

    /*public ColdSteel(String _type, boolean _hasBlade, boolean _hasButt, boolean _hasEdge, boolean _hasHandle,
                     double _bladeLength, double _buttThickness, double _bladeHardness,
                     boolean _safetyOfHandle, boolean _edgeSharpness) {
        this.type = _type;
        this.hasHandle = _hasHandle;
        this.hasButt = _hasButt;
        this.hasEdge = _hasEdge;
        this.hasBlade = _hasBlade;
        this.bladeLength = _bladeLength;
        this.bladeHardness = _bladeHardness;
        this.buttThickness = _buttThickness;
        this.safetyOfHandle = _safetyOfHandle;
        this.edgeSharpness = _edgeSharpness;
    }*/

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
    /*public String getType() {
        return type;
    }*/

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


    public  boolean isCivilColdSteel() {
        if (bladeLength >= 0.1 && buttThickness >= 0.026 && buttThickness <= 0.06 && bladeHardness >= 42 &&
                    edgeSharpness && safetyOfHandle)
            return true;
        else return false;
    }


   /* public String toString() { // или абстрактный и в каждом определить?
        return
    }*/
}

