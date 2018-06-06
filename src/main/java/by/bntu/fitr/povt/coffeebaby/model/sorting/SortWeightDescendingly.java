package by.bntu.fitr.povt.coffeebaby.model.sorting;

import by.bntu.fitr.povt.coffeebaby.model.essence.Stone;

import java.util.Comparator;

public class SortWeightDescendingly implements Comparator<Stone> {

    public int compare(Stone stone1, Stone stone2) {

        Double weigth1 = stone1.getWeigth();
        Double weight2 = stone2.getWeigth();
        return weight2.compareTo(weigth1);
    }
}

