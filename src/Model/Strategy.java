package Model;

import Model.ColdSteel;

import java.util.List;

public interface Strategy {
    public List<ColdSteel> search(List<ColdSteel> weapons, double firstParam, double secondParam);
}
