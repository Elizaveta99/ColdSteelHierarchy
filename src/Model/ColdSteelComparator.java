package Model;

import java.util.Comparator;

public class ColdSteelComparator implements Comparator<ColdSteel> {

    private int getNumber(ColdSteel obj){
        if (obj == null)
            return -1;
        if(obj instanceof PiercingWeapons)
            return 1;
        if(obj instanceof ChoppingWeapons)
            return 2;
        if(obj instanceof StabbingWeapons)
            return 3;
        if(obj instanceof ShockFragmenting)
            return 4;
        return 0;
    }

    @Override
    public int compare(ColdSteel o1, ColdSteel o2) {
        return getNumber(o1) - getNumber(o2);
    }
}
