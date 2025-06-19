import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        List list=new ArrayList<String>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Cherry");
        list.add("DraganFruit");

       Stream <String>stream = list.stream();

       int a[]={12,45,6,78,65,4360,25,69};
        IntStream intStream=Arrays.stream(a);

        Stream<String>stream1=Stream.of("K","O","M","A","L");

    }

}
