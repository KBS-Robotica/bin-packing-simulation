package src.main;

import java.util.ArrayList;

public abstract class Algorithm {
    public abstract ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights);
    public abstract ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights, boolean decreasing);
}
