package by.bntu.fitr.povt.coffeebaby.model.sorting;

import by.bntu.fitr.povt.coffeebaby.view.View;

import java.util.Collections;
import java.util.List;

public class Sorter {

    public enum TypeSort {
        SortPriceAscending, SortPriceDescendingly, SortWeightAscending, SortWeightDescendingly;
    }

    public static void sort(List list, TypeSort type) {

        switch (type) {
            case SortPriceAscending:
                Collections.sort(list, new SortPriceAscending());
                break;
            case SortPriceDescendingly:
                Collections.sort(list, new SortPriceDescendingly());
                break;
            case SortWeightAscending:
                Collections.sort(list, new SortWeightAscending());
                break;
            case SortWeightDescendingly:
                Collections.sort(list, new SortPriceDescendingly());
                break;

        }

    }

}




