package by.bntu.fitr.povt.coffeebaby.model.sorting;


import by.bntu.fitr.povt.coffeebaby.model.essence.Stone;


import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort implements Sorting {

    public void sort(ArrayList<Stone> arr, int thinkToSort) {

        switch(thinkToSort){
            case 1: {
                boolean flag;
                for (int i = arr.size() - 1; i > 0; i--) {
                    flag = false;
                    for (int j = 0; j < i; j++) {
                        if (arr.get(j).getPrice() > arr.get(j + 1).getPrice()) {
                            Collections.swap(arr, j, j + 1);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        break;
                    }
                }
            }
            break;
            case 2:{
                boolean flag;
                for (int i = arr.size() - 1; i > 0; i--) {
                    flag = false;
                    for (int j = 0; j < i; j++) {
                        if (arr.get(j).getWeigth() > arr.get(j + 1).getWeigth()) {
                            Collections.swap(arr, j, j + 1);
                            flag = true;
                        }
                    }
                    if (!flag) {
                        break;
                    }
                }
            }
            break;
        }



    }
}