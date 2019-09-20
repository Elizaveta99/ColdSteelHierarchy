package Model;

import java.util.Objects;

/**
 * Class-inheritor of ColdSteel class
 */
public class PiercingWeapons extends ColdSteel {

    private double bladeLength = -2;
    private double buttThickness = -2;
    private double bladeHardness = -2;
    private boolean safetyOfHandle = false;
    private boolean edgeSharpness = false;

    public PiercingWeapons(String _type, String _title, double _price,
                           double _bladeLength, double _buttThickness,
                           double _bladeHardness, boolean _safetyOfHandle,
                           boolean _edgeSharpness)
    {
        super(_type, _title, _price);
        this.bladeLength = _bladeLength;
        this.buttThickness = _buttThickness;
        this.bladeHardness = _bladeHardness;
        this.safetyOfHandle = _safetyOfHandle;
        this.edgeSharpness = _edgeSharpness;
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

    public void causeDamage() {
        System.out.println("Applying damage from piercing cold steel");
    }

    @Override
    public void isCivilColdSteel()
    {
        if (bladeLength >= 0.9 && buttThickness >= 0.026 && buttThickness <= 0.06 && bladeHardness >= 42 &&
                edgeSharpness && safetyOfHandle)
            System.out.println(this.getTitle() + " is a civil cold steel");
        else System.out.println(this.getTitle() + " is not a civil cold steel");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PiercingWeapons)) return false;
        if (!super.equals(o)) return false;
        PiercingWeapons that = (PiercingWeapons) o;
        return Double.compare(that.getBladeLength(), getBladeLength()) == 0 &&
                Double.compare(that.getButtThickness(), getButtThickness()) == 0 &&
                Double.compare(that.getBladeHardness(), getBladeHardness()) == 0 &&
                getSafetyOfHandle() == that.getSafetyOfHandle() &&
                getEdgeSharpness() == that.getEdgeSharpness();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBladeLength(), getButtThickness(), getBladeHardness(), getSafetyOfHandle(), getEdgeSharpness());
    }

    @Override
    public String toString() {
        return super.toString() + ", \n" +
                "bladeLength = " + this.getBladeLength() +
                ", buttThickness = " + this.getButtThickness() +
                ", bladeHardness = " + this.getBladeHardness() +
                ", safetyOfHandle = " + this.getSafetyOfHandle() +
                ", edgeSharpness = " + this.getEdgeSharpness();
    }
}
