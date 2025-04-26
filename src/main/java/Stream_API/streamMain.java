package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamMain {

    public static void main(String[] args) {

        //1.List.of()

        List<Integer> list1=List.of(1,2,5,6,7);

        //2.ArrayList
       List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(5);
        list2.add(7);
        list2.add(9);

        //3.Arrays.asList()
        List<Integer> list3= Arrays.asList(22,11,44,55,22,99);

        //Before StreamAPI:

        List<Integer> ListEven=new ArrayList<>();
        for(int i:list1){
            if(i%2==0){
                ListEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(ListEven);

        //After Stream
        //Stream<Integer> stream = list1.stream();
       // List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

        List<Integer> collect = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);


    }
}
