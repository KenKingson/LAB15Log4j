package by.bntu.fitr.povt.coffeebaby.model.essence;

public abstract class Stone implements Comparable<Stone> {
    private double weigth;
    private double price;

    public Stone() {
    }

    public Stone(double weigth, double price) {
        this.weigth = weigth;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    @Override
    public int compareTo(Stone stone) {
        if (price > stone.getPrice()) {
            return 1;
        } else if (price < stone.getPrice()) {
            return -1;
        }

        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stone stone = (Stone) o;

        if (Double.compare(stone.weigth, weigth) != 0) return false;
        return Double.compare(stone.price, price) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weigth);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Stone{" +
                " | Weigth = " + String.format("%.2f", weigth) +
                " | Price = " + String.format("%.1f", price) +
                "}\n";
    }
}
