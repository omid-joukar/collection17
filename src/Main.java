import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by KPS on 8/13/2020.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements "+c1);
    }
}
