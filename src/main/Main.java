package src.main;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static int MAX_WEIGHT = 9;

    public static void main(String[] args) {
        int testAmount = 10;
        int totalBoxes = 0;
        int totalSpaceWasted = 0;

        FirstFit testAlgorithm = new FirstFit();

//        ArrayList<Integer> weights = new ArrayList<Integer>();
//        weights.add(9);
//        weights.add(3);
//        weights.add(6);
//        weights.add(6);
//        weights.add(9);
//        weights.add(6);
//        weights.add(3);
//        weights.add(9);
//        weights.add(3);

//        System.out.println(testAlgorithm.runAlgorithm(weights));
        for (int tests = 0; tests < testAmount; tests++){
            ArrayList<ArrayList<Integer>> results = testAlgorithm.runAlgorithm(Utils.GetRandomWeights());

            for (ArrayList<Integer> result : results) {
                totalSpaceWasted += (MAX_WEIGHT - Utils.calculateSum(result));
            }

            totalBoxes += results.size();
        }

        float averageBoxes = (float) totalBoxes / testAmount;
        float averageSpaceWasted = (float) totalSpaceWasted / testAmount;

        System.out.printf("Next Fit gemiddeld aantal dozen: %s%n", averageBoxes);
        System.out.printf("Next Fit gemiddeld verspilde ruimte: %s%n", averageSpaceWasted);
    }
}