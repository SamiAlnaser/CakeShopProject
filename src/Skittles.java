public class Skittles extends CakeDecorator {
    Cake cake;

    public Skittles(Cake cake) {
        this.cake = cake;
    }

    public String getDescription() {
        return cake.getDescription() + ", Skittles";
    }

    public double cost() {
        return cake.cost() + 2.5;
    }
}