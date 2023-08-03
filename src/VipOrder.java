import java.util.ArrayList;

public class VipOrder extends Order{
    public VipOrder(int id, String name, String address, ArrayList<Item> ItemsInOrder, Costumer orderCostumer, double totalPrice, double paymentType, int orderDate) {
        super(id, name, address, ItemsInOrder, orderCostumer, totalPrice, paymentType, orderDate);
    }

    public double totalPrice(ArrayList<Item> arr) {
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).getPrice();
        }
        sum *= getOrderCostumer().getDiscount();
       return sum;
    }
}
