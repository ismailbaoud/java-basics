public class Weapon extends  Item{

    private  int damage;
    private String type;

    @Override
    public String toString() {
        return "weapon: " + getName() + ", quantity: " + getQuantity() + ", type: " + type + ", damage: " + damage;
    }

    public Weapon(String name, int quantity, int damage, String type) {
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }
}
