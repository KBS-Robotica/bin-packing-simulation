package src.main;

import java.util.ArrayList;
import java.util.Collections;

import static src.main.Main.MAX_WEIGHT;

public class BestFit extends Algorithm{

    @Override
    public ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights, boolean reversed) {
        if (reversed) {
            weights.sort(Collections.reverseOrder());
        }
        return runAlgorithm(weights);
    }

    @Override
    public ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights) {
        ArrayList<ArrayList<Integer>> boxes = new ArrayList<>();
        boxes.add(new ArrayList<>());

        weights.forEach((weight) -> {
<<<<<<< HEAD
            boolean addedToExistingBox = false;

            //boxes.stream().filter((box) -> Utils.calculateSum(box) + weight <= MAX_WEIGHT).;

            for (ArrayList<Integer> box : boxes) {
=======
            Integer bestBoxIndex = null;
            for (int i = 0; i < boxes.size(); i++) {
                ArrayList<Integer> box = boxes.get(i);
>>>>>>> 2db9e122c1a426cc96293bd9898a777f633e3f1a
                int currentBoxWeight = Utils.calculateSum(box);

                if (bestBoxIndex == null) {
                    if (currentBoxWeight + weight <= MAX_WEIGHT) {
                        bestBoxIndex = i;
                    }
                } else if (
                        currentBoxWeight + weight <= MAX_WEIGHT &&
                        Utils.calculateSum(boxes.get(bestBoxIndex)) < currentBoxWeight + weight
                ) {
                    bestBoxIndex = i;
                }
            }

            if (bestBoxIndex != null) {
                boxes.get(bestBoxIndex).add(weight);
            } else {
                ArrayList<Integer> newBox = new ArrayList<>();
                newBox.add(weight);
                boxes.add(newBox);
            }
        });

        return boxes;
    }

}
