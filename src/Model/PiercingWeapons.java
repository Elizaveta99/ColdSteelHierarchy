package Model;

public class PiercingWeapons extends ColdSteel {

    public PiercingWeapons(String _type, boolean _hasBlade, boolean _hasButt, boolean _hasEdge, boolean _hasHandle,
                           double _bladeLength, double _buttThickness,
                           double _bladeHardness, boolean _safetyOfHandle, boolean _edgeSharpness) {
        super(_type, true, true, true, true,
                _bladeLength, _buttThickness, _bladeHardness, _safetyOfHandle, _edgeSharpness);
        /*setBladeLength(_bladeLength);
        setHasBlade(_hasBlade);
        setHasButt(_hasButt);
        setHasEdge(_hasEdge);
        setHasHandle(_hasHandle);
        setBladeHardness(_bladeHardness);
        setButtThickness(_buttThickness);
        setSafetyOfHandle(_safetyOfHandle);
        setEdgeSharpness(_edgeSharpness);*/
    }

    public void causeDamage() {

    }
}
