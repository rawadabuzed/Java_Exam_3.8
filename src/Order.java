import java.util.ArrayList;

public abstract class Order {
    private int id;
    private String name;

    private String address;

    private ArrayList<Item> ItemsInOrder;
    private Costumer orderCostumer;
    private double totalPrice;
    private double paymentType;

    public Order(int id, String name, String address, ArrayList<Item> ItemsInOrder, Costumer orderCostumer, double totalPrice, double paymentType, int orderDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.ItemsInOrder = ItemsInOrder;
        this.orderCostumer = orderCostumer;
        this.totalPrice = totalPrice;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
    }

    private int orderDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Item> getItemsInOrder() {
        return ItemsInOrder;
    }

    public void setItemsInOrder(ArrayList<Item> itemsInOrder) {
        ItemsInOrder = itemsInOrder;
    }

    public Costumer getOrderCostumer() {
        return orderCostumer;
    }

    public void setOrderCostumer(Costumer orderCostumer) {
        this.orderCostumer = orderCostumer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(double paymentType) {
        this.paymentType = paymentType;
    }

    public int getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(int orderDate) {
        this.orderDate = orderDate;
    }

    public void orderToFavorite(Costumer cos,ArrayList<Item> arr){
            cos.setFavoriteItems(arr);
    }


}


