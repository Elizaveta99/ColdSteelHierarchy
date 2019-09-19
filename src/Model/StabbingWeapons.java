package Model;

public class StabbingWeapons extends ColdSteel {

    public StabbingWeapons(ColdSteelBuilder builder)
    {
        super(builder);
    }

    @Override
    public void causeDamage() {
        System.out.println("Weapon stabbes");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", bladeLength = " + this.getBladeLength() +
                ", buttThickness = " + this.getButtThickness() +
                ", bladeHardness = " + this.getBladeHardness() +
                ", safetyOfHandle = " + this.getSafetyOfHandle() +
                ", edgeSharpness = " + this.getEdgeSharpness();
    }
}
