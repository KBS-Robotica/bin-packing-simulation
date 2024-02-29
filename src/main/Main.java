package src.main;

import java.util.ArrayList;

public class Main {
    static int MAX_WEIGHT = 9;

    public static void main(String[] args) {
        int testAmount = 10;
        int totalBoxes = 0;

        NextFit testAlgorithm = new NextFit();

        for (int tests = 0; tests < testAmount; tests++){
            totalBoxes += testAlgorithm.runAlgorithm(Utils.GetRandomWeights()).size();
        }

        float averageBoxes = (float) totalBoxes / testAmount;
        float averageSpaceWasted = MAX_WEIGHT - averageBoxes;

        System.out.printf("Next Fit gemiddeld aantal dozen: %s%n", averageBoxes);
        System.out.printf("Next Fit gemiddeld verspilde ruimte: %s%n", averageSpaceWasted);
    }

}
