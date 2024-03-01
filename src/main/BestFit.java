package src.main;

import java.util.ArrayList;
import java.util.Collections;

import static src.main.Main.MAX_WEIGHT;

public class BestFit {

    public ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights, boolean reversed) {
        if (reversed) {
            weights.sort(Collections.reverseOrder());
        }
        return runAlgorithm(weights);
    }

    public ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights) {
        ArrayList<ArrayList<Integer>> boxes = new ArrayList<>();
        boxes.add(new ArrayList<>());

        weights.forEach((weight) -> {
            boolean addedToExistingBox = false;

            boxes.stream().filter((box) -> Utils.calculateSum(box) + weight <= MAX_WEIGHT).;

            for (ArrayList<Integer> box : boxes) {
                int currentBoxWeight = Utils.calculateSum(box);

                if (currentBoxWeight + weight <= MAX_WEIGHT) {
//                    box.add(weight);
//                    addedToExistingBox = true;
//                    break;

                }
            }

            if (!addedToExistingBox) {
                ArrayList<Integer> newBox = new ArrayList<>();
                newBox.add(weight);
                boxes.add(newBox);
            }
        });

        return boxes;
    }

}
