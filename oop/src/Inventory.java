import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    public void setItem(Item item){
        items.add(item);
    }
    public void setItem(    String name , int quantity){
        items.add(new Item(name,quantity));
    }


    public void displayInventory(){
        for(Item item : items) {
            System.out.println(item.toString());
        }
    }

}
