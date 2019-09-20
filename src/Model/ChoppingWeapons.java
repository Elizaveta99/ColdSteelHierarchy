package Model;

import java.util.Objects;

/**
 * Class-inheritor of ColdSteel class
 */
public class ChoppingWeapons extends ColdSteel {

    public ChoppingWeapons(ColdSteelBuilder builder)
    {
        super(builder);
    }

    @Override
    public void causeDamage() {
        System.out.println("Applying damage from chopping cold steel");
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
                ", safetyOfHandle = " + this.getSafetyOfHandle() +
                ", edgeSharpness = " + this.getEdgeSharpness();
    }
}
