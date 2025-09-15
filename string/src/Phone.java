public class Phone {
    protected String os;
    public int ram;
    public double price;
    public String name;

    public Phone(String name){
        this.os = name;
    }
    public Phone(){
    }

    static void main() {

    }

    public void ring() {
        System.out.println("ringing");
    }

    public void call() {
        System.out.println("calling");
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs() {
        return this.os;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}