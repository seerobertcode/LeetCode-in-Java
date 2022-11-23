import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        List<String> resultsList = new ArrayList<>();
        int n = 15;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                resultsList.add("FizzBuzz");
            } else if (i % 3 == 0) {
                resultsList.add("Fizz");
            } else if (i % 5 == 0) {
                resultsList.add("Buzz");
            } else {
                resultsList.add(Integer.toString(i));
            }
        }
        System.out.println(resultsList);
    }
}
