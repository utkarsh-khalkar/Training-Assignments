package assignments.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Utkarsh Khalkar
 * Title: ArrayList Example which show working of arraylist
 * Time: 10:28 AM
 * Date: 07-02-2025
 *
 */
public class ArrayListExample {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add(1);
        list.add("C");
        list.add(1.1);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
