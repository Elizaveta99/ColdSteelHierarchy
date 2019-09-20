package Model;

import java.util.Objects;

/**
 * Class-inheritor of ColdSteel class
 */
public class ChoppingWeapons extends ColdSteel {

    private boolean safetyOfHandle = false;
    private boolean edgeSharpness = false;

    public ChoppingWeapons(String _type, String _title, double _price,
                           boolean _safetyOfHandle, boolean _edgeSharpness)
    {
        super(_type, _title, _price);
        this.safetyOfHandle = _safetyOfHandle;
        this.edgeSharpness = _edgeSharpness;
    }

    public boolean getSafetyOfHandle() { return safetyOfHandle; }

    public boolean getEdgeSharpness() {
        return edgeSharpness;
    }

    public void causeDamage() {
        System.out.println("Applying damage from chopping cold steel");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChoppingWeapons)) return false;
        if (!super.equals(o)) return false;
        ChoppingWeapons that = (ChoppingWeapons) o;
        return getSafetyOfHandle() == that.getSafetyOfHandle() &&
                getEdgeSharpness() == that.getEdgeSharpness();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSafetyOfHandle(), getEdgeSharpness());
    }

    @Override
    public String toString() {
        return super.toString() + ", \n" +
                "safetyOfHandle = " + this.getSafetyOfHandle() +
                ", edgeSharpness = " + this.getEdgeSharpness();
    }
}
