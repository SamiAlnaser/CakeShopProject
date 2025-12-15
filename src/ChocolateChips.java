public class ChocolateChips extends CakeDecorator {
    Cake cake;

    public ChocolateChips(Cake cake) {
        this.cake = cake;
    }

    public String getDescription() {
        return cake.getDescription() + ", Chocolate Chips";
    }

    public double cost() {
        return cake.cost() + 1.5;
    }
}