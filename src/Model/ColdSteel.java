package Model;

/**
 * Base for factory
 * @author Elizaveta Rudko
 * @version 1.0.0
 */
public abstract class ColdSteel {
    /**
     * Field - title of cold steel
     */
    private String title = "ColdSteel";

    /**
     * Field - type of cold steel
     */
    private String type = "coldsteel";

    /**
     * Fields - determine the presence of a certain part of the weapon
     */
    private boolean hasBlade = true;
    private boolean hasEdge = true;
    private boolean hasButt = true;
    private boolean hasHandle = true;

    private double bladeLength = -1;
    private double buttThickness = -1;
    private double bladeHardness = -1;
    private boolean safetyOfHandle = false;
    private boolean edgeSharpness = false;

    /**
     * Constructor - creates cold steel of certain type
     * @param _type - type of the cold steel
     */
    public ColdSteel(String _type, boolean _hasBlade, boolean _hasButt, boolean _hasEdge, boolean _hasHandle,
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
    }

    /**
     * Causes damage
     */
    public abstract void causeDamage();

    /**
     * Sets tile of cold steel
     * @param _title - title
     */
    public void setTitle(String _title) {
        this.title = _title;
    }

    /**
     * Returns title of cold steel
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns type of cold steel
     * @return type
     */
    public String getType() {
        return type;
    }


    public void setHasBlade(boolean _hasBlade) {
        this.hasBlade = _hasBlade;
    }
    public boolean getHasBlade() {
        return hasBlade;
    }

    public void setHasEdge(boolean _hasEdge) {
        this.hasEdge = _hasEdge;
    }
    public boolean getHasEdge() {
        return hasEdge;
    }

    public void setHasButt(boolean _hasButt) {
        this.hasButt = _hasButt;
    }
    public boolean getHasButt() {
        return hasButt;
    }

    public void setHasHandle(boolean _hasHandle) {
        this.hasHandle = _hasHandle;
    }
    public boolean getHasHandle() {
        return hasHandle;
    }





    public void setBladeLength(double _bladeLength) {
        this.bladeLength = _bladeLength;
    }
    public double getBladeLength() {
        return bladeLength;
    }

    public void setButtThickness(double _buttThickness) {
        this.buttThickness = _buttThickness;
    }
    public double getButtThickness() {
        return buttThickness;
    }


    public void setBladeHardness(double _bladeHardness) {
        this.bladeHardness = _bladeHardness;
    }
    public double getBladeHardness() {
        return bladeHardness;
    }

    public void setSafetyOfHandle(boolean _safetyOfHandle) {
        this.safetyOfHandle = _safetyOfHandle;
    }
    public boolean getSafetyOfHandle() {
        return safetyOfHandle;
    }

    public void setEdgeSharpness(boolean _edgeSharpness) {
        this.edgeSharpness = _edgeSharpness;
    }
    public boolean getEdgeSharpness() {
        return edgeSharpness;
    }


    public  boolean isCivilColdSteel() {
        if (hasBlade && hasEdge && hasButt && hasHandle && bladeLength >= 0.1
                && buttThickness >= 0.026 && buttThickness <= 0.06 && bladeHardness >= 42 &&
                    edgeSharpness && safetyOfHandle)
            return true;
        else return false;
    }


   /* public String toString() { // или абстрактный и в каждом определить?
        return
    }*/
}

