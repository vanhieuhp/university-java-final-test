import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class CAU5 {
        public static void main(String[] args) {
            int[] numbers = {5, 3, 2, 5, 3};
            
            IntUnaryOperator square = num -> num * num;
            
            int[] squaredNumbers = Arrays.stream(numbers)
                                         .map(square)
                                         .toArray();
            
            System.out.println("Mảng mới chứa bình phương của các số từ mảng đã cho: " + Arrays.toString(squaredNumbers));
        }
}
