package Model;

import Model.ColdSteel;

import java.util.List;

/**
 * Interface for pattern Strategy
 * @author  Elizaveta Rudko
 * @version 1.0.0
 */
public interface Strategy {
    List<ColdSteel> search(List<ColdSteel> weapons, double firstParam, double secondParam);
}
