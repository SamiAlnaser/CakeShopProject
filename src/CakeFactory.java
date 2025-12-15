public class CakeFactory {

    public Cake createCake(String type) {
        if (type.equalsIgnoreCase("apple")) {
            return new AppleCake();
        } else if (type.equalsIgnoreCase("cheese")) {
            return new CheeseCake();
        } else if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateCake();
        }
        return null;
    }
}