package Stream3Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirst {
    public static void main(String[] args) {
        List<String> list1= Arrays.asList("Banana","Apple","Chery","Kiwi","Cheese","Guava","Orange","Kiwi","Applei");
        Optional<String> c = list1.stream()
                .filter(str -> str.startsWith("C"))
                .findFirst();

        if(c.isPresent()){
            System.out.println(c.get());
        }


    }
}
