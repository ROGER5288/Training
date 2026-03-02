package Algo;

import java.util.*;

public class KnapsackGreedyLambda {

    static class Item {
        int value, weight;

        Item(int v, int w) {
            value = v;
            weight = w;
        }
    }

    public static void main(String[] args) {

        int W = 8;

        Item[] items = {
            new Item(10, 5),  // I1
            new Item(5, 2),   // I2
            new Item(20, 3)   // I3
        };

        double totalValue = 0;

        // Lambda sort by value/weight ratio (descending)
        Arrays.sort(items, (a, b) -> Double.compare((double)b.value/b.weight, (double)a.value/a.weight));

        for (Item item : items) {

            if (W >= item.weight) {
                W -= item.weight;
                totalValue += item.value;
            } else {
                // fractional (optional)
                totalValue += ((double)item.value / item.weight) * W;
                break;
            }
        }

        System.out.println("Maximum value = " + totalValue);
    }
}

