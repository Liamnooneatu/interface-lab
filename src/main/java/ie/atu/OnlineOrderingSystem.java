package ie.atu;
public class OnlineOrderingSystem {

    public static void main(String[] args) {
        MenuItem[] menuItems = new MenuItem[4];

        // Populating the array with instances of Burger, Pizza, Salad, and Dessert
        menuItems[0] = new Burger("burger", 3.99, "Beef patty, Lettuce , Tomato , Cheese");
        menuItems[1] = new Pizza("margherita Pizza", 10.99, "tomato sauce, mozzarella and basil");
        menuItems[2] = new Salad("caesar Salad", 6, "romaine lettuce, Croutons and  Caesar dressing");
        menuItems[3] = new Dessert("apple pie and ice cream", 3.99, "freshly picked apples, with cold ice cream and warm pie");


        double totalCost = 0.0;
        for (MenuItem item : menuItems) {
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Price: €" + item.getPrice());
            System.out.println("\n");
            totalCost += item.getPrice();
        }

        // Display total cost of the order
        System.out.println("Total cost of the order: €" + totalCost);
    }
}



