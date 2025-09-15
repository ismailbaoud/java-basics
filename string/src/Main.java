//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Phone phone1 = new Phone();
       Phone phone2 = new Phone();

       phone1.setOs("indroid");
       phone1.ram = 16;
       phone1.name = "g";
       phone1.price = 12.8;
        phone1.call();
        phone1.ring();
        System.out.println(phone1.getOs());
        phone1.setOs("kkk");

        Student student = new Student();
        student.age = 18;

        PrivateStudent privateStudent1 = new PrivateStudent();
        PublicStudent publicStudent1 = new PublicStudent();
        privateStudent1.schookName = "kk";
        publicStudent1.oneTimeFee = 1;

    }
}