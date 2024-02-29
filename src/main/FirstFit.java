package src.main;

import java.util.ArrayList;

import static src.main.Main.MAX_WEIGHT;

public class NextFit {
    public ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights) {
        ArrayList<ArrayList<Integer>> boxes = new ArrayList<>();
        boxes.add(new ArrayList<>());

        weights.forEach((weight) -> {
            ArrayList<Integer> currentBox = boxes.get(boxes.size() -1);
            int currentBoxWeight = Utils.calculateSum(currentBox);

            if (currentBoxWeight + weight >  MAX_WEIGHT) {
                boxes.add(new ArrayList<>(weight));
            } else {
                currentBox.add(weight);
            }
        });

        return boxes;
    }

}
