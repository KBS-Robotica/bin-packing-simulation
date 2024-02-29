package src.main;

import java.util.ArrayList;

public class NextFit {

    static int MAX_WEIGHT = 9;

    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;

        // Loop door de ArrayList en tel elk element op
        for (int value : list) {
            sum += value;
        }

        return sum;
    }

    public ArrayList<ArrayList<Integer>> nextFitTest(ArrayList<Integer> weights) {
        ArrayList<ArrayList<Integer>> boxes = new ArrayList<>();
        boxes.add(new ArrayList<>());

        weights.forEach((weight) -> {
            ArrayList<Integer> currentBox = boxes.get(boxes.size() -1);
            int currentBoxWeight = calculateSum(currentBox);

            if (currentBoxWeight + weight >  MAX_WEIGHT) {
                boxes.add(new ArrayList<>(weight));
            } else {
                currentBox.add(weight);
            }
        });

        return boxes;
    }

}
