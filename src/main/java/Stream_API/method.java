package Stream_API;

import java.util.List;
import java.util.stream.Collectors;

public class method {
    public static void main(String[] args) {

        //Filter:
        //In Filter we need to provide predicate which will return T/F

        List<String> list1=List.of("Akshay","Abhi","Arav","Piyush");

        List<String> a = list1.stream().filter(e -> e.contains("A")).collect(Collectors.toList());

        System.out.println(a);


        //Map
        //In Map we need to provide a function
        //Return Square

        List<Integer> list2=List.of(5,2,6,7);
        List<Integer> Square = list2.stream().map(e -> e * e).collect(Collectors.toList());
        System.out.println(Square);

    }
}
