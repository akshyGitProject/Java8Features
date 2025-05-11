package Stream3Easy;

import java.util.Arrays;
import java.util.List;

public class duplicate {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Banana","Apple","Chery","Kiwi","Guava","Orange","Kiwi","Apple");

        list1.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
