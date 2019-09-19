package View;

import Controller.Controller;
import Model.ColdSteel;

import java.util.List;

/**
 * Main class, demonstrates methods from Controller class
 * @author  Elizaveta Rudko
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args)
    {
        List<ColdSteel> weapons = Controller.getListOfColdSteel();
        Controller.outListOfColdSteel(weapons);
        //найти в диапазоне заданных параметров
        //посортить по типу
        Controller.getSortedList(weapons);
        //вывести
        // найти общую стоимость
    }
}
