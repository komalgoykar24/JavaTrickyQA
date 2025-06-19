import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOpeartions {
    public static void main(String[] args) {
      List<Integer> list=Arrays.asList(12,57,10,21,457,864,65,44,72);
        List collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);


    }
}
