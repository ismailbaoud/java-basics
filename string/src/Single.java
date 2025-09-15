import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Single{
    private Integer[] numbers = {1,6,8,7,5};
    private List<Integer> list = Arrays.asList(numbers);

    public Single(){
        System.out.println("object created");
        Collections.shuffle(list);
    }
    public void printer(){
        for(int i : list ) {
            System.out.println("number: " +i);
        }
    }
}
