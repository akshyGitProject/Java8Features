package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(7);
        list2.add(9);

        Stream<Integer> stream1=list2.stream();

        stream1.forEach(e->{
            System.out.println(e);
        });
    }
}
