package by.bntu.fitr.povt.coffeebaby.model.enginesForContainers;

public class ListQueue extends CommonList {

    public Object pop() {

        Object element = node.element;
        node = node.next;
        return element;

    }


}
