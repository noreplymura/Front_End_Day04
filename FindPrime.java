public class FindPrime{
    public static void main(String[] args) {
        int[] arr = {10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67};
        int n = 11; 

        int smallestPrime = Integer.MAX_VALUE;
        int sumOfPrimes = 0;

        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                if (arr[i] < smallestPrime) {
                    smallestPrime = arr[i];
                } else {
                    sumOfPrimes += arr[i];
                }
            }
        }

        System.out.println("Sum of all prime numbers except the smallest prime: " + sumOfPrimes);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
