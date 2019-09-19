package Model;

import java.util.ArrayList;
import java.util.List;

public class StrategySearchByLengthOfTitle implements Strategy {
    public List<ColdSteel> search(List<ColdSteel> weapons, double firstParam, double secondParam)
    {
        List<ColdSteel> ans = new ArrayList<>();
        for (ColdSteel weapon: weapons)
        {
            if (weapon.getTitle().length() >= firstParam && weapon.getTitle().length() <= secondParam)
                ans.add(weapon);
        }
        return ans;
    }
}
