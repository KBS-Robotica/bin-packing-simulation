package src.main;

import java.util.ArrayList;
import java.util.Collections;

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

public class Utils {
    public ArrayList<Integer> GetRandomWeights(){
        ArrayList<Integer> weights = new ArrayList<Integer>();
        weights.add(9);
        weights.add(3);
        weights.add(6);
        weights.add(6);
        weights.add(9);
        weights.add(6);
        weights.add(3);
        weights.add(9);
        weights.add(3);
    }

    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;

        // Loop door de ArrayList en tel elk element op
        for (int value : list) {
            sum += value;
        }

        return sum;
    }
}