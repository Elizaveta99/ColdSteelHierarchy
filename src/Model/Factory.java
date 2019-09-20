package Model;

import java.lang.Exception;

/**
 * Factory of cold steels
 * @author Elizaveta Rudko
 * @version 1.0.0
 */
public class Factory {

    /**
     * Types of cold steel
     */
    public enum ColdSteelType{Piercing, Chopping, Stabbing, ShockFragmenting};

    /**
     * Implementation of factory method
     * @param _type - type
     * @param _title - title
     * @param _price - price
     * @param _bladeLength - length of blade
     * @param _buttThickness - thickness of butt
     * @param _bladeHardness - hardness of blade
     * @param _safetyOfHandle - safety of handle
     * @param _edgeSharpness - sharpness of edge
     * @return - object of inherits of ColdSteel class
     */
    public static ColdSteel createColdSteel(String _type, String _title, double _price,
                                            double _bladeLength, double _buttThickness,
                                                double _bladeHardness, boolean _safetyOfHandle,
                                                    boolean _edgeSharpness) {
        ColdSteelType type = ColdSteelType.valueOf(_type);
        ColdSteel coldSteelObject = null;// = new ColdSteel(_type, _title, _price);;
        if (_type.equals("Piercing"))
            coldSteelObject = new PiercingWeapons(_type, _title, _price, _bladeLength, _buttThickness,
                    _bladeHardness, _safetyOfHandle, _edgeSharpness);
        else if (_type.equals("Chopping"))
            coldSteelObject = new ChoppingWeapons(_type, _title, _price, _safetyOfHandle, _edgeSharpness);
        else if (_type.equals("Stabbing"))
            coldSteelObject = new StabbingWeapons(_type, _title, _price, _bladeLength, _buttThickness,
                    _bladeHardness, _safetyOfHandle, _edgeSharpness);
        else if (_type.equals("ShockFragmenting"))
            coldSteelObject = new ShockFragmenting(_type, _title, _price);

        return coldSteelObject;
    }
}
