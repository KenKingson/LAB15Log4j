package by.bntu.fitr.povt.coffeebaby.model.enginesForContainers;


public class ListStack extends CommonList {


    public Object pop() {

        Node help = node;

        for (int i = 1; i < size() - 1; i++) {
            help = help.next;
        }
        Object helpStone = help.next.element;
        help.next = null;
        return helpStone;
    }


}
