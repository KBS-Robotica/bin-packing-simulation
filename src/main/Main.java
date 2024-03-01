package src.main;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static int MAX_WEIGHT = 9;
    static String leftAlignFormat = "| %-15s | %-5.2f | %-5.2f |%n";

    public static void main(String[] args) {
        System.out.format("+-----------------+-------+-------+%n");
        System.out.format("| Algorithm       | Boxes | waste |%n");
        System.out.format("+-----------------+-------+-------+%n");

        Utils.TestAlgorithm("Next fit", new NextFit(), false);
        Utils.TestAlgorithm("First fit", new FirstFit(), false);
        Utils.TestAlgorithm("First fit <", new FirstFit(), true);

        System.out.format("+-----------------+-------+-------+%n");
    }
}