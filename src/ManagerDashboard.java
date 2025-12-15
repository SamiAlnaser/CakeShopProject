import java.util.HashMap;

public class ManagerDashboard implements Observer {

    private HashMap<String, Integer> soldCakes = new HashMap<>();

    @Override
    public void update(String cakeName, int orderNumber) {
        int count = soldCakes.getOrDefault(cakeName, 0) + 1;
        soldCakes.put(cakeName, count);

        System.out.println("[Manager Dashboard] Updated Sales:");
        soldCakes.forEach((name, qty) -> System.out.println("  " + name + " = " + qty));
    }
}