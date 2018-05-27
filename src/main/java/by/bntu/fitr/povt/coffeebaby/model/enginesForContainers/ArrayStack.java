package by.bntu.fitr.povt.coffeebaby.model.enginesForContainers;


public class ArrayStack extends CommonArray {

    public Object pop() {


        if (isEmpty()) {
            return null;

        } else {
            Object[] helpArray = new Object[this.size() - 1];
            Object nextStone = this.array[this.size() - 1];

            for (int i = 0; i < this.size() - 1; i++) {
                helpArray[i] = this.array[i];
            }

            this.array = helpArray;
            return nextStone;
        }

    }


}
