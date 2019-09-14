package Model;

public class CrushingWeapons extends ColdSteel {

    public CrushingWeapons(String _type, boolean _hasBlade, boolean _hasButt, boolean _hasEdge, boolean _hasHandle,
                           double _bladeLength, double _buttThickness,
                           double _bladeHardness, boolean _safetyOfHandle, boolean _edgeSharpness) {
        super(_type, _hasBlade, _hasButt, _hasEdge, _hasHandle,
                _bladeLength, _buttThickness, _bladeHardness, _safetyOfHandle, _edgeSharpness);
        /*setHasBlade(_hasBlade);
        setHasButt(_hasButt);
        setHasEdge(_hasEdge);
        setHasHandle(_hasHandle);*/
    }

    public void causeDamage() {

    }
}
