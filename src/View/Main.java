package View;

import Controller.Controller;
import Model.ColdSteel;
import Model.StrategySearchByLengthOfTitle;
import Model.StrategySearchByPrice;

import java.util.List;

/**
 * Main class, demonstrates methods from Controller class
 * @author  Elizaveta Rudko
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args)
    {
        Controller controller = new Controller();
        List<ColdSteel> weapons = controller.getListOfColdSteel();
        System.out.println("Collection of weapons");
        controller.outListOfColdSteel(weapons);

        System.out.println("Sorted by type collection of weapons");
        controller.getSortedList(weapons);

        System.out.println("Common cost : " + controller.getCommonCost(weapons));

        controller.setStrategy(new StrategySearchByLengthOfTitle());
        List<ColdSteel> weaponsByLength = controller.executeStrategy(weapons, 2, 5);
        System.out.println("Collection of weapons with length of titles between " + 2 + " and " + 5);
        controller.outListOfColdSteel(weaponsByLength);

        controller.setStrategy(new StrategySearchByPrice());
        List<ColdSteel> weaponsByPrice = controller.executeStrategy(weapons, 90, 200);
        System.out.println("Collection of weapons with prices between " + 90 + " and " + 200);
        controller.outListOfColdSteel(weaponsByPrice);


    }
}
