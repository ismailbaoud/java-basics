import java.util.Iterator;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<String>  linky = new LinkedList<String>();
        linky.add("ismail");
        linky.add("baoud");
        linky.add("hero");
//        linky.remove();
        System.out.println(linky);

        boolean found = false;
        for (String item : linky){
            if(item == "ismail") {
                found = true;
            }
        }
        System.out.println(found == true ? "found " : "not found");

        Iterator it = linky.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            linky.remove(it.next());
        }

    }
}