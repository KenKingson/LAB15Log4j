package by.bntu.fitr.povt.coffeebaby.model.sorting;

import by.bntu.fitr.povt.coffeebaby.model.essence.Necklace;
import by.bntu.fitr.povt.coffeebaby.model.essence.Stone;

import java.util.ArrayList;

public class FindByWeight {
   private ArrayList container;



    public static ArrayList lookUpTo(Necklace necklace, int value, int countOfStones) {
        ArrayList container = new ArrayList();
        StonesCalc stonesCalc = new StonesCalc();
        Stone stone;
        stonesCalc.sortStonesByWeigth(necklace);
        for (int i = 0; i < countOfStones; i++) {
            stone = (Stone) necklace.getStone(i);
            if (stone.getPrice() < value) {
                container.add(stone);
            }
        }
        return container;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < container.size(); i++) {

            builder.append(container.get(i).toString());

        }
        return "Necklace{" + builder + " }";


    }
}
