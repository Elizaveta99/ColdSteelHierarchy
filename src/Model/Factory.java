package Model;

import java.lang.Exception;

/**
 * Factory of cold steels
 * @author Elizaveta Rudko
 * @version 1.0.0
 */
public class Factory {

    public enum ColdSteelType{Piercing, Chopping, Stabbing, ShockFragmenting};

    /**
     * Implementation of factory method
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
