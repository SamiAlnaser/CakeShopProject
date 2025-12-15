public class CustomerDashboard implements Observer {

    @Override
    public void update(String cakeName, int orderNumber) {
        System.out.println("[Customer Dashboard] Order #" + orderNumber + ": " + cakeName);
    }
}