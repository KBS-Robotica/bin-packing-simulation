package src.main;

import java.util.ArrayList;

import static src.main.Main.MAX_WEIGHT;

public class NextFit extends Algorithm {
    public ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights) {
        ArrayList<ArrayList<Integer>> boxes = new ArrayList<>();
        boxes.add(new ArrayList<>());

        weights.forEach((weight) -> {
            ArrayList<Integer> currentBox = boxes.get(boxes.size() -1);
            int currentBoxWeight = Utils.calculateSum(currentBox);

            if (currentBoxWeight + weight >  MAX_WEIGHT) {
                ArrayList<Integer> newBox = new ArrayList<>();
                newBox.add(weight);
                boxes.add(newBox);
            } else {
                currentBox.add(weight);
            }
        });

        return boxes;
    }

    @Override
    public ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights, boolean decreasing) {
        return runAlgorithm(weights);
    }

}
