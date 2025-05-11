import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class practice {
    public static void main(String[] args) {
        //List<String> list1= Arrays.asList("Banana","BApple","Chery","Kiwi","Guava","Orange","Kiwi","Apple","Ice");
        List<Integer> list= Arrays.asList(2,3,4,5,6);

        List<Integer> collect = list.stream()
                .map(str->str*str).collect(Collectors.toList());
        System.out.println(collect);

        //reduce.ifPresent(str->System.out.println(str));

        System.out.println("-----------------------");

        int[] arr=new int[]{2,3,4,5,6};
        Arrays.stream(arr)
                .map(str->str*str)
                .forEach(str->System.out.print(str+" "));



    }
}
