import java.util.ArrayList;

public class CakeOrderingSystem implements Subject {

    private static CakeOrderingSystem instance;
    private ArrayList<Observer> observers = new ArrayList<>();
    private int orderCounter = 0;

    // Private constructor 
    private CakeOrderingSystem() { }

    // Singleton access method
    public static CakeOrderingSystem getInstance() {
        if (instance == null) {
            instance = new CakeOrderingSystem();
        }
        return instance;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String cakeName, int orderNumber) {
        for (Observer o : observers) {
            o.update(cakeName, orderNumber);
        }
    }

    // Main order method
    public void placeOrder(Cake cake) {
        orderCounter++;

        String cakeName = cake.getDescription();
        double price = cake.cost();

        System.out.println("\n--- Order Placed ---");
        System.out.println("Order #" + orderCounter);
        System.out.println("Cake: " + cakeName);
        System.out.println("Total: " + price + " JD");

        notifyObservers(cakeName, orderCounter);
    }
}
