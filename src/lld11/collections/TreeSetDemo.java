package lld11.collections;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(92);  // Duplicate — ignored

        // Iteration is in SORTED order!
        for (int score : scores) {
            System.out.println(score);  // 78 → 85 → 92
        }
    }
}
