package Controller;

import Model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class with methods that demonstrate functionality
 * @author  Elizaveta Rudko
 * @version 1.0.0
 */
public class Controller {

    /**
     * Field - for certain strategy of behaviour for the class
     */
    private Strategy strategy;

    /**
     * Setter of the strategy
     * @param strategy - certain strategy
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Method that applies strategy method "search"
     * @param weapons - list of weapons
     * @param firstParam - first title or price
     * @param secondParam - second title or price
     * @return result of the "search" method
     */
    public List<ColdSteel> executeStrategy(List<ColdSteel> weapons, double firstParam, double secondParam) {
        return strategy.search(weapons, firstParam, secondParam);
    }

    /**
     * Prints list of the weapons
     * @param weapons - list of weapons
     */
    public void outListOfColdSteel(List<ColdSteel> weapons)
    {
        for (ColdSteel weapon: weapons)
        {
            System.out.println(weapon.toString());
        }
        System.out.println();
    }

    /**
     * Initializes list of the weapons
     * @return - new list
     */
    public List<ColdSteel> getListOfColdSteel()
    {
        Factory factory = new Factory();
        List<ColdSteel> weapons = new ArrayList<>();
        weapons.add(factory.createColdSteel("Piercing", "rapier", 200.0, 51,
                0.05, 60, true, true) );
        weapons.add(factory.createColdSteel("Stabbing", "sword", 10.0, 10,
                1, 35, false, true) );
        weapons.add(factory.createColdSteel("Piercing", "spear", 100.0, 0.9,
                0.03, 45, true, true) );
        weapons.add(factory.createColdSteel("ShockFragmenting", "mace", 300.0, 52,
                0.05, 51, true, false) );
        weapons.add(factory.createColdSteel("Stabbing", "katana", 200.0, 53,
                0.05, 60, true, true) );
        weapons.add(factory.createColdSteel("Chopping", "tomahawk", 210.0, 30,
                0.04, 90, true, false) );

        return  weapons;
    }

    /**
     * Method that finds common cost
     * @param weapons - our list
     * @return - common cost
     */
    public double getCommonCost(List<ColdSteel> weapons)
    {
        double cost = 0;
        for (ColdSteel weapon: weapons)
        {
            cost += weapon.getPrice();
        }
        return  cost;
    }

    /**
     * Sorts collection of weapons by type
     * @param weapons - sorted weapons
     */
    public void getSortedList(List<ColdSteel> weapons)
    {
        Collections.sort(weapons, new ColdSteelComparator());
        outListOfColdSteel(weapons);
    }
}
