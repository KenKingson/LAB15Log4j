package by.bntu.fitr.povt.coffeebaby.model.sorting;

import by.bntu.fitr.povt.coffeebaby.model.Stone;

import java.util.ArrayList;
import java.util.Collections;


public class QuickSort implements Sorting{

    public void sort(ArrayList<Stone> array, int x) {
        int startIndex = 0;
        int endIndex = array.size() - 1;
        doSort(array, startIndex, endIndex);


    }

    private void doSort(ArrayList<Stone> array,int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array.get(i).getWeigth() <= array.get(i).getWeigth())) {
                i++;
            }
            while (j > cur && (array.get(cur).getWeigth() <= array.get(j).getWeigth())) {
                j--;
            }
            if (i < j) {
                Collections.swap(array,i,j);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(array,start, cur);
        doSort(array,cur+1, end);
    }
}
