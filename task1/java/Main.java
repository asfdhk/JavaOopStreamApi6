import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "da dfdgd fdgdf dfdf";

        String[] words = text.split(" ");

        int amount = Arrays.stream(words)
                .filter(a-> a.length() >4)
                .mapToInt(String ::length)
                .reduce(0,Integer::sum);
        System.out.println(amount);
    }
}

