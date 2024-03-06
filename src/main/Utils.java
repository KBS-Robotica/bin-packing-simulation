package src.main;

import java.util.ArrayList;
import java.util.Collections;

import static src.main.Main.LEFT_ALIGN_FORMAT;
import static src.main.Main.TEST_AMOUNT;

public class Utils {
    public static ArrayList<Integer> GetRandomWeights(){
        ArrayList<Integer> weights = new ArrayList<Integer>();
        weights.add(3);
        weights.add(3);
        weights.add(3);
        weights.add(6);
        weights.add(6);
        weights.add(6);
        weights.add(9);
        weights.add(9);
        weights.add(9);

        Collections.shuffle(weights);

        return weights;
    }

    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;

        // Loop door de ArrayList en tel elk element op
        for (int value : list) {
            sum += value;
        }

        return sum;
    }

    public static void TestAlgorithm(String algorithmName, Algorithm testAlgorithm, boolean decreasing){
        int totalBoxes = 0;
        int totalSpaceWasted = 0;

        for (int tests = 0; tests < TEST_AMOUNT; tests++){
            ArrayList<ArrayList<Integer>> results = testAlgorithm.runAlgorithm(Utils.GetRandomWeights(), decreasing);

            for (ArrayList<Integer> result : results) {
                totalSpaceWasted += (Main.MAX_WEIGHT - Utils.calculateSum(result));
            }

            totalBoxes += results.size();
        }

        float averageBoxes = (float) totalBoxes / TEST_AMOUNT;
        float averageSpaceWasted = (float) totalSpaceWasted / TEST_AMOUNT;

        System.out.format(LEFT_ALIGN_FORMAT, algorithmName, averageBoxes, averageSpaceWasted);
    }
}
