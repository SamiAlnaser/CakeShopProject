public class Cream extends CakeDecorator {
    Cake cake;

    public Cream(Cake cake) {
        this.cake = cake;
    }

    public String getDescription() {
        return cake.getDescription() + ", Cream";
    }

    public double cost() {
        return cake.cost() + 2.0;
    }
}
