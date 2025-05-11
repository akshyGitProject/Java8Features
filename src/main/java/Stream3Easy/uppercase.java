package Stream3Easy;

import java.util.Arrays;
import java.util.List;

public class uppercase {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Banana","Apple","Chery","Kiwi","Guava","Orange");

        list1.stream().map(str->str.toUpperCase())
                .sorted().
                forEach(System.out::println);

    }
}
