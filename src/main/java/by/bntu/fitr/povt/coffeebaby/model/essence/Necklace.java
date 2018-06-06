package by.bntu.fitr.povt.coffeebaby.model.essence;


import java.util.ArrayList;
import java.util.Iterator;


public class Necklace implements Iterable<Stone> {
    private ArrayList<Stone> container;

    public Necklace(ArrayList<Stone> containers) {
        this.container = containers;
    }

    public ArrayList<Stone> getNecklace() {
        return container;
    }

    public Stone getStone(int index) {
        return container.get(index);
    }

    public void delStone(int index) {
        container.remove(index);
    }

    public void addStone(Stone stone) {
        container.add(stone);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        for (Stone stone : container) {
            builder.append(stone);
        }
        return "Necklace{" + builder + " }";

    }

    @Override
    public Iterator<Stone> iterator() {
        return container.iterator();
    }
}