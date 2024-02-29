package src.main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
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

        System.out.printf(
                "Next Fit Dozen Aantal: %s%n",
                new NextFit().nextFitTest(weights).size());

    }

}
