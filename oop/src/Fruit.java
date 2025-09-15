public class Fruit extends Item{
    private String type;


    public Fruit(String type ,String name, int quantity ) {
        super(name, quantity);
        this.type = type;
    }

    @Override
    public String toString() {
        return "fruit: " + getName() + ", quantity: " +getQuantity() + ", type : " + type ;
    }
}
