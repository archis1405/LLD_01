package lld11.collections;

import java.util.*;

public class LinkedHashSetDemo{

    public static void main(String[] args) {

        Set<String> visitedPages = new LinkedHashSet<>();

        visitedPages.add("Home");
        visitedPages.add("Products");
        visitedPages.add("Cart");
        visitedPages.add("Home");  // Duplicate — ignored, order unchanged

        // Iteration follows insertion order!
        for (String page : visitedPages) {
            System.out.println(page);  // Home → Products → Cart
        }
    }
}
