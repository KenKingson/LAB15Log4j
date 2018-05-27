package by.bntu.fitr.povt.coffeebaby.model.enginesForContainers;

public abstract class CommonArray extends Checker {
    protected Object[] array = new Object[0];

    public Object getElement(int index) {
        return this.array[index];
    }


    public void push(Object element) {

        Object[] nextArray = new Object[this.size() + 1];
        System.arraycopy(this.array, 0, nextArray, 0, this.array.length);
        nextArray[nextArray.length - 1] = element;
        this.array = nextArray;
    }

    public int size() {
        return (array.length);
    }


}


