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
     * @return - object of ColdSteel class
     */
    public static ColdSteel createColdSteel(String _type, String _title, double _price,
                                            double _bladeLength, double _buttThickness,
                                                double _bladeHardness, boolean _safetyOfHandle,
                                                    boolean _edgeSharpness) {
        ColdSteelType type = ColdSteelType.valueOf(_type);
        ColdSteel coldSteelObject = null;
        switch (type) {
            case Piercing:
                coldSteelObject = new PiercingWeapons.ColdSteelBuilder(_type, _title, _price)
                        .setBladeLength(_bladeLength)
                        .setButtThickness(_buttThickness)
                        .setBladeHardness(_bladeHardness)
                        .setSafetyOfHandle(_safetyOfHandle)
                        .setEdgeSharpness(_edgeSharpness).build();
            case Chopping:
                coldSteelObject = new ChoppingWeapons.ColdSteelBuilder(_type, _title, _price)
                        .setSafetyOfHandle(_safetyOfHandle)
                        .setEdgeSharpness(_edgeSharpness).build();
            case Stabbing:
                coldSteelObject = new StabbingWeapons.ColdSteelBuilder(_type, _title, _price)
                        .setBladeLength(_bladeLength)
                        .setButtThickness(_buttThickness)
                        .setBladeHardness(_bladeHardness)
                        .setSafetyOfHandle(_safetyOfHandle)
                        .setEdgeSharpness(_edgeSharpness).build();
            case ShockFragmenting:
                coldSteelObject = new ShockFragmenting.ColdSteelBuilder(_type, _title, _price)
                        .build();
        }
        return coldSteelObject;
    }
}
