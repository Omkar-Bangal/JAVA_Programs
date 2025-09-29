abstract class Restaurant
{
    abstract void getMenu();
    abstract void placeOrder(String item);
}
class FastFoodRestaurant extends Restaurant
{
    void getMenu()
    {
        System.out.println("1] Burger 2] Fries 3]Pizza ");
    }
    void placeOrder(String item)
    {
        System.out.println("Order placed : "+ item);
    }
}
class FineDiningRestaurant extends Restaurant
{
    void getMenu()
    {
        System.out.println("1] Biryani , 2] Paneer Tikka , 3] Butter Naan");
    }
    void placeOrder(String item)
    {
        System.out.println("Order placed : "+item);
    }
}
interface Delivery
{
    void DeliverOrder(String item);
}
class DeliveryApp extends FastFoodRestaurant implements Delivery
{
    public void DeliverOrder(String item)
    {
        System.out.println("Delivering "+item+" to customer.");
    }
}
public class Restaurant_menu
{
    public static void main(String args[])
    {
        DeliveryApp app = new DeliveryApp();
        app.getMenu();
        app.placeOrder("Burger");
        app.DeliverOrder("Burger");
    }


}
