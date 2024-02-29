package src.main;

import java.util.ArrayList;

import static src.main.Main.MAX_WEIGHT;

public class FirstFit {
    public ArrayList<ArrayList<Integer>> runAlgorithm(ArrayList<Integer> weights) {
        ArrayList<ArrayList<Integer>> boxes = new ArrayList<>();
        boxes.add(new ArrayList<>());

        weights.forEach((weight) -> {
            boxes.forEach((box) -> {
                int currentBoxWeight = Utils.calculateSum(box);

                if (currentBoxWeight + weight >  MAX_WEIGHT) {
                } else {
                    box.add(weight);
                }
            });
        });

        return boxes;
    }

}
