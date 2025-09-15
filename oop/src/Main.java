//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
//        Item item = new Item("banana", 26);
//        Item item1 = new Item("sword", 2);
        Fruit fruit = new Fruit("fuji", "apple", 23);
        Weapon weapon = new Weapon("weapen", 24, 25, "nemo");
        inventory.setItem("ismail",12);
        inventory.setItem(fruit);
        inventory.setItem(weapon);

        inventory.displayInventory();
    }
}