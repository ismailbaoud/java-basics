import java.text.NumberFormat;
import java.util.Locale;
public class NumberFormatClass {

    public static void main(String[] args) {
        double number = 1_543.49;
        Locale locale = new Locale("ar", "SA");
        NumberFormat numberFormater = java.text.NumberFormat.getNumberInstance(locale);
        System.out.println("number: " + numberFormater.format(number));
        Locale locale1 = new Locale("en", "spa");

        NumberFormat curFormatter = NumberFormat.getCurrencyInstance(locale1);
        System.out.println("currency: " + curFormatter.format(number));

        NumberFormat intFormatter = NumberFormat.getIntegerInstance(locale1);
        System.out.println("int: " + intFormatter.format(number));

    }
}
