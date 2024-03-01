package src.main;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

import static src.main.Main.MAX_WEIGHT;

public class FirstFit {
    public ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights) {
        ArrayList<ArrayList<Integer>> boxes = new ArrayList<>();
        boxes.add(new ArrayList<>());

        weights.forEach((weight) -> {
            boxes.stream()
                    .filter((box) -> Utils.calculateSum(box) + weight <= MAX_WEIGHT)
                    .findFirst()
                    .ifPresentOrElse(
                            box -> box.add(weight),
                            () -> {
                                ArrayList<Integer> newBox = new ArrayList<>();
                                newBox.add(weight);
                                boxes.add(newBox);
                            }
                    );

//            boolean addedToExistingBox = false;
//
//            for (ArrayList<Integer> box : boxes) {
//                int currentBoxWeight = Utils.calculateSum(box);
//
//                if (currentBoxWeight + weight <= MAX_WEIGHT) {
//                    box.add(weight);
//                    addedToExistingBox = true;
//                    break;
//                }
//            }
//
//            if (!addedToExistingBox) {
//                ArrayList<Integer> newBox = new ArrayList<>();
//                newBox.add(weight);
//                boxes.add(newBox);
//            }
        });

        return boxes;
    }
}
