package Controller;

import Model.ColdSteel;
import Model.Factory;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static List<ColdSteel> getListOfColdSteel()
    {
        Factory factory = new Factory();
        List<ColdSteel> weapons = new ArrayList<>();
        weapons.add(factory.createColdSteel("Piercing", "spear", 100.0, 0.9,
                0.03, 45, true, true) );
        weapons.add(factory.createColdSteel("Piercing", "rapier", 200.0, 50,
                0.05, 60, true, true) );

        //доподнить, изменить
        weapons.add(factory.createColdSteel("Stabbing", "sword", 50.0, 0.9,
                0.03, 45, true, true) );

        weapons.add(factory.createColdSteel("Stabbing", "katana", 200.0, 50,
                0.05, 60, true, true) );
        return  weapons;
    }

    public static double getCommonCost(List<ColdSteel> weapons)
    {
        double cost = 0;
        for (ColdSteel weapon: weapons)
        {
            cost += weapon.getPrice();
        }
        return  cost;
    }



}
