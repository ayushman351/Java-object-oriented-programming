package Level1;
public class TrackInventory {
    public static void main(String[] args) {
        Item pen=new Item("#001", "Pen", 10);
        pen.showDetails();
        pen.findCost(25);
    }
}

class Item{
    String itemCode;
    String itemName;
    double price;

    Item(String itemCode, String itemName, double price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }

    void showDetails(){
        System.out.println("Item code: "+itemCode+", Item name: "+itemName+", price: "+price);

    }
    void findCost(int quantity){
     double totalCost=quantity*price;
     System.out.println("Total cost for "+quantity+" "+itemName+" is "+totalCost);
    }
}
