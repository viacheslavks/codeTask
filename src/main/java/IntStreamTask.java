import java.util.stream.IntStream;

public class IntStreamTask {
    public static void main(String[] args) {
        IntStream.iterate(1, x -> x+1)
                .limit(5)
                .sorted()
                .forEach(System.out::println);
    }
}
