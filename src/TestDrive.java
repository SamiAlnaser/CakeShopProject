public class TestDrive {

    public static void main(String[] args) {

        // Dashboards
        CustomerDashboard cd = new CustomerDashboard();
        ManagerDashboard md = new ManagerDashboard();

        CakeOrderingSystem system = CakeOrderingSystem.getInstance();

        system.registerObserver(cd);
        system.registerObserver(md);

        CakeFactory factory = new CakeFactory();

        // Order #1
        Cake c1 = factory.createCake("chocolate");
        c1 = new Cream(c1);
        system.placeOrder(c1);

        // Order #2
        Cake c2 = factory.createCake("apple");
        c2 = new ChocolateChips(c2);
        c2 = new Skittles(c2);
        system.placeOrder(c2);

        // Order #3
        Cake c3 = factory.createCake("cheese");
        c3 = new Cream(c3);
        c3 = new Cream(c3);
        system.placeOrder(c3);
    }
}