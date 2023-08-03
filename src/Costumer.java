import java.util.ArrayList;

public class Costumer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String type;
    private int discount;

    private ArrayList<Item>favoriteItems;

    private Item gift;

    public Costumer(int id, String firstName, String lastName, String email, String address, String type, int discount, ArrayList<Item> favoriteItems, Item gift) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.type = type;
        this.discount = discount;
        this.favoriteItems = favoriteItems;
        this.gift = gift;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public ArrayList<Item> getFavoriteItems() {
        return favoriteItems;
    }

    public void setFavoriteItems(ArrayList<Item> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

    public Item isGift() {
        return gift;
    }

    public void setGift(Item gift) {
        this.gift = gift;
    }

    public void addToFave(Item item,ArrayList<Item> arr){
        arr.add(item);
    }
    public void deleteFromFave(Item item,ArrayList<Item> arr){
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId() == item.getId()){
                arr.remove(i);
            }

        }
    }

    public void takeGift(Item gift){
        setGift(gift);
    }

    public void openGift(){
        System.out.println("Congratulations !you got a new gift! Enjoy!");
    }
}
