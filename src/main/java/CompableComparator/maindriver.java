package CompableComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class maindriver {

    public static void main(String[] args) {

        List<Emp> list=new ArrayList<>();
        Emp e1=new Emp("Akshay",26,10000);
        Emp e2=new Emp("Virat",27,20000);
        Emp e3=new Emp("Rohit",25,30000);
        Emp e4=new Emp("Ashish",22,40000);
        Emp e5=new Emp("Anushka",23,50000);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Collections.sort(list);

        System.out.println(list);


    }
}
