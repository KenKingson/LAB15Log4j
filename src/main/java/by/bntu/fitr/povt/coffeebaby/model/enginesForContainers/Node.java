package by.bntu.fitr.povt.coffeebaby.model.enginesForContainers;

public class Node {
    private Object stone;
    private Node next;

    public Node() {
    }

    public Node(Object stone, Node next) {
        this.next = next;
        this.stone = stone;
    }

    public Object getElement() {
        return stone;
    }

    public Node getNext() {
        return next;
    }

    public void setElement(Object stone) {
        this.stone = stone;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
