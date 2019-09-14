package Model;

import java.lang.Exception;

/**
 * Factory of cold steels
 * @author Elizaveta Rudko
 * @version 1.0.0
 */
public abstract class Factory {

    //private enum Type{ORIENTAL, BALLROOM, FOLK, POP};

    /**
     * Implementation of factory method
     *
     * @author Syrovatnikov Nikita
     * @version 1.0.0
     */

    // или сюда коллекцию передавать уже? класс для коллекции отдельный
    public static ColdSteel getClassFromFactory(int id, String _type, boolean _hasBlade, boolean _hasButt, boolean _hasEdge, boolean _hasHandle,
                                                double _bladeLength, double _buttThickness,
                                                double _bladeHardness, boolean _safetyOfHandle, boolean _edgeSharpness) throws Exception {
        switch (id) {
            case 1:
                return new PiercingWeapons(_type, _hasBlade, _hasButt, _hasEdge, _hasHandle,
                        _bladeLength, _buttThickness, _bladeHardness, _safetyOfHandle, _edgeSharpness);
            case 2:
                return new ChoppingWeapons(_type, _hasBlade, _hasButt, _hasEdge, _hasHandle,
                        _bladeLength, _buttThickness, _bladeHardness, _safetyOfHandle, _edgeSharpness);
            case 3:
                return new StabbingWeapons(_type, _hasBlade, _hasButt, _hasEdge, _hasHandle,
                        _bladeLength, _buttThickness, _bladeHardness, _safetyOfHandle, _edgeSharpness);
            case 4:
                return new ShockFragmenting(_type, _hasBlade, _hasButt, _hasEdge, _hasHandle,
                        _bladeLength, _buttThickness, _bladeHardness, _safetyOfHandle, _edgeSharpness);
            case 5:
                return new CrushingWeapons(_type, _hasBlade, _hasButt, _hasEdge, _hasHandle,
                        _bladeLength, _buttThickness, _bladeHardness, _safetyOfHandle, _edgeSharpness);
                default: throw new Exception();
        }
    }
}
