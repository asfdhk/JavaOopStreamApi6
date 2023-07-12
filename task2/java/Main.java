import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,34,5,3,6);

        int product = numbers.stream()
                .reduce(1,(a,b) -> a * b);
        System.out.println(product);
    }
}

