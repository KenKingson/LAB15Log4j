package by.bntu.fitr.povt.coffeebaby.model.sorting;

import by.bntu.fitr.povt.coffeebaby.model.essence.Stone;

import java.util.Comparator;

public class SortPriceDescendingly implements Comparator<Stone> {

    public int compare(Stone stone1, Stone stone2) {

        Double price1 = stone1.getPrice();
        Double price2 = stone2.getPrice();
        return price2.compareTo(price1);
    }
}

