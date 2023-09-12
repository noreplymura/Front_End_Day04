import java.lang.reflect.Array;
import java.util.*;
public class Prime {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
            for(int i=2;i<=Math.sqrt(number);i++)
            {
                if (number % i == 0)
                    return false;
            }
            return true;
}

public static int calculateSum(int[] arr,int n) {
    ArrayList<Integer> prime = new ArrayList<Integer>();
    for (int i = 0; i < n; i++)
        if (isPrime(arr[i]))
            prime.add(arr[i]);
    int sum = 0;
    if (prime.size() > 0) {
        Collections.sort(prime);
        for (int j = 0; j < (prime.size() - 1); j++)
            sum += prime.get(j);
        return sum;
    } else {
        Arrays.sort(arr);
        for (int k = 0; k < (n - 1); k++)
            sum += arr[k];
        return sum;
    }
}
    public static void main(String[] args) {
        int[] input1 = { 10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67 };
        int[] input2 = { 10, 200, 30, 40 };
        System.out.println(calculateSum(input1, 11));
        System.out.println(calculateSum(input2, 4));
    }
}