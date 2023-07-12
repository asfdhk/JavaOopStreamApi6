import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,34,5,3,6);

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE,Integer::max);
        System.out.println(max);
    }
}

