package by.bntu.fitr.povt.coffeebaby.model.enginesForContainers;

public interface List {
    boolean isEmpty();

    void push(Object element);

    Object pop();

    int size();

    Object getElement(int index);

}
