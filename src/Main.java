import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = IntStream.of(55, 24, 67, 933, 752, 1238)
                .boxed()
                .toList();

        System.out.println("Введені числа: " + numbers);

        int sumOfEvens = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сума парних чисел: " + sumOfEvens);

        List<Integer> multipliedList = numbers.stream()
                .map(num -> num * 2)
                .toList();
        System.out.println("Помножені на 2 числа: " + multipliedList);

        int maxNumber = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow();
        System.out.println("Максимальне число: " + maxNumber);

        String oddNumbersAsString = numbers.stream()
                .filter(num -> num % 2 != 0)
                .map(Object::toString)
                .reduce((str1, str2) -> str1 + "," + str2)
                .orElse("");
        System.out.println("Непарні числа: " + oddNumbersAsString);

        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Середнє арифметичне: " + average);
    }
}