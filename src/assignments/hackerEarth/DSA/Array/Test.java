package assignments.hackerEarth.DSA.Array;

import java.util.ArrayList;

public class Test {


    public void add()
    {

    }
    public void addTwoNumber(ArrayList<Integer> list)
    {
        list.add(12);
        list = new ArrayList<>();
        System.out.println(list);
    }


    public static void main(String[] args) {
        Test  t = new Test();
       final ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list =new ArrayList();
        System.out.println(list);

        t.addTwoNumber(list);
    }
}
