package Stream3Easy;

import java.util.Arrays;
import java.util.List;

public class length {

    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Banana","Apple","Chery","Kiwi","Guava","Orange");

//        list1.stream()
//                .filter(str->str.length()>5)
//                .forEach(System.out::println);

        list1.stream()
                .map(str->str.length())
                .forEach(System.out::println);

    }
}
