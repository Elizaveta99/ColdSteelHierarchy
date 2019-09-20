package Model;

/**
 * Class-inheritor of ColdSteel class
 */
public class ShockFragmenting extends ColdSteel
{
    public ShockFragmenting(String _type, String _title, double _price)
    {
        super(_type, _title, _price);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void causeDamage() {
        System.out.println("Applying damage from shock-fragmenting cold steel");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
