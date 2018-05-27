package by.bntu.fitr.povt.coffeebaby.model;

public class SemipreciousStone extends Stone {
    private String type;

    public SemipreciousStone() {
        super();
    }

    public SemipreciousStone(double weigth, double price, String type) {
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
        return "Semiprecious Stone(Type = " + String.format("%10s", this.getType()) +
                " | Weigth = " + String.format("%.2f", this.getWeigth()) +
                " | Price = " + String.format("%.1f", this.getPrice()) + ")\n";
    }
}
