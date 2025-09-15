import java.util.Arrays;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Queueue queueu = new Queueue();
        queueu.enqueue(2);
        queueu.enqueue(6);
        queueu.enqueue(9);
        queueu.enqueue(1);
        queueu.enqueue(9);
        queueu.dequeue();
        queueu.dequeue();
        queueu.dequeue();
        queueu.displayQueue();
        System.out.println(queueu.isEmptey());
        System.out.println(queueu.isFull());
    }



}