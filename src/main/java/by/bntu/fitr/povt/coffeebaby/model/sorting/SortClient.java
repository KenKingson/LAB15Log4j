package by.bntu.fitr.povt.coffeebaby.model.sorting;

import by.bntu.fitr.povt.coffeebaby.model.essence.Stone;

import java.util.ArrayList;


public class SortClient<T extends ArrayList<Stone>> {
    Sorting strategy;


    public void setTypeOfSort(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeSort(T container, int toSort) {
        strategy.sort(container, toSort);
    }
}
