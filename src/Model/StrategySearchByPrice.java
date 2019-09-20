package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements interface Strategy for certain behaviour of search method
 * @author  Elizaveta Rudko
 * @version 1.0.0
 */
public class StrategySearchByPrice implements Strategy {
    public List<ColdSteel> search(List<ColdSteel> weapons, double firstParam, double secondParam)
    {
        List<ColdSteel> ans = new ArrayList<>();
        for (ColdSteel weapon: weapons)
        {
            if (weapon.getPrice() >= firstParam && weapon.getPrice() <= secondParam)
                ans.add(weapon);
        }
        return ans;
    }
}
