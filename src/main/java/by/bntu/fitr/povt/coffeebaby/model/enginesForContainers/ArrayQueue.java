package by.bntu.fitr.povt.coffeebaby.model.enginesForContainers;

public class ArrayQueue extends CommonArray {


    public Object pop() {

        if (isEmpty()) {
            return null;
        } else {
            Object[] helpArray = new Object[this.size() - 1];
            Object nextStone = this.array[this.size() - 1];

            for (int i = 1; i < this.size(); i++) {
                helpArray[i - 1] = this.array[i];
            }

            this.array = helpArray;
            return nextStone;
        }

    }
}


