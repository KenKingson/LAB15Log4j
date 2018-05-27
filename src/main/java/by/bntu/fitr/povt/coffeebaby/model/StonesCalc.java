package by.bntu.fitr.povt.coffeebaby.model;

import by.bntu.fitr.povt.coffeebaby.model.sorting.SortPriceAscending;
import by.bntu.fitr.povt.coffeebaby.model.sorting.SortWeightAscending;

import java.util.Collections;


public class StonesCalc implements Calculator {


    public void sortStonesByWeigth(Necklace necklace) {
        Collections.sort(necklace.getNecklace(), new SortWeightAscending());
    }


    public void sortStonesByPrice(Necklace necklace) {
        Collections.sort(necklace.getNecklace(), new SortPriceAscending());

    }

}
