import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(50);
        integers.add(39);
        integers.add(1);
        integers.add(24);
        integers.add(66);
        integers.add(23);
        integers.add(15);

        Collections.sort(integers);


        for (Integer i: integers) {
            System.out.println(i);
        }

        }


    }
