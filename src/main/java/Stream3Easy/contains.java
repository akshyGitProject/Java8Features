package Stream3Easy;

import java.util.Arrays;
import java.util.List;

public class contains {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Banana","Apple","Chery","Kiwi","Guava","Orange");

        list1.stream()
                .filter(str->str.contains("G"))
                .forEach(System.out::println);
    }
}
