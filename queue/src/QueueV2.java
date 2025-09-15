import java.util.LinkedList;
import java.util.Queue;

public class QueueV2 {
    public static void main(String[] args) {
        Queue<String> bbqLine = new LinkedList<String>();
        bbqLine.add("a");
        bbqLine.add("b");
        bbqLine.add("c");
        bbqLine.poll();


//        bbqLine.add("ismail");
//        bbqLine.add("baoud");
//        bbqLine.add("all might");
//        System.out.println(bbqLine.peek());
        System.out.println(bbqLine.toArray()[1]);

    }
}
