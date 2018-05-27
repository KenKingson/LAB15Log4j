package by.bntu.fitr.povt.coffeebaby.model;

public class PreciousStone extends Stone {
    private String type;

    public PreciousStone() {
        super();
    }

    public PreciousStone(double weigth, double price, String type) {
        super(weigth, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Precious Stone    (Type = " + String.format("%10s", this.getType()) +
                " | Weigth = " + String.format("%.2f", this.getWeigth()) +
                " | Price = " + String.format("%.1f", this.getPrice()) + ")\n";
    }
}
