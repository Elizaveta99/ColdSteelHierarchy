package Controller;

import Model.ColdSteel;
import Model.ColdSteelComparator;
import Model.Factory;
import Model.Strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<ColdSteel> executeStrategy(List<ColdSteel> weapons, double firstParam, double secondParam) {
        return strategy.search(weapons, firstParam, secondParam);
    }

    public void outListOfColdSteel(List<ColdSteel> weapons)
    {
        for (ColdSteel weapon: weapons)
        {
            System.out.println(weapon.toString());
        }
        System.out.println();
    }

    public List<ColdSteel> getListOfColdSteel()
    {
        Factory factory = new Factory();
        List<ColdSteel> weapons = new ArrayList<>();
        weapons.add(factory.createColdSteel("Piercing", "spear", 100.0, 0.9,
                0.03, 45, true, true) );
        weapons.add(factory.createColdSteel("Piercing", "rapier", 200.0, 50,
                0.05, 60, true, true) );
        weapons.add(factory.createColdSteel("Stabbing", "sword", 10.0, 10,
                1, 35, false, true) );
        weapons.add(factory.createColdSteel("ShockFragmenting", "mace", 300.0, 50,
                0.05, 51, true, false) );
        weapons.add(factory.createColdSteel("Stabbing", "katana", 200.0, 50,
                0.05, 60, true, true) );
        weapons.add(factory.createColdSteel("Chopping", "tomahawk", 210.0, 30,
                0.04, 90, true, false) );
        return  weapons;
    }

    public double getCommonCost(List<ColdSteel> weapons)
    {
        double cost = 0;
        for (ColdSteel weapon: weapons)
        {
            cost += weapon.getPrice();
        }
        return  cost;
    }

    public void getSortedList(List<ColdSteel> weapons)
    {
        Collections.sort(weapons, new ColdSteelComparator());
        outListOfColdSteel(weapons);
    }
}
