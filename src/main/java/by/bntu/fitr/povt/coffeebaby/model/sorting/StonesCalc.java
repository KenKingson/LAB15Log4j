package by.bntu.fitr.povt.coffeebaby.model.sorting;

import by.bntu.fitr.povt.coffeebaby.model.essence.Necklace;

import java.util.Collections;


public class StonesCalc implements Calculator {


    public void sortStonesByWeigth(Necklace necklace) {
        Collections.sort(necklace.getNecklace(), new SortWeightAscending());
    }


    public void sortStonesByPrice(Necklace necklace) {
        Collections.sort(necklace.getNecklace(), new SortPriceAscending());

    }

}
