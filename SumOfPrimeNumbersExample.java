public class SumOfPrimeNumbersExample {
    static int uprlimit = 1000;
    static long numbers[] = new long[uprlimit + 1];

    static void findSum() {
        int array[] = new int[uprlimit + 1];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i <= Math.sqrt(uprlimit); i++)
            if (array[i] == 0)
                for (int j = i * i; j <= uprlimit; j = j + i)
                    array[j] = 1;
        long primeSum = 0;
        for (int i = 1; i <= uprlimit; i++) {
            if (array[i] == 0)
                primeSum = primeSum + i;
            numbers[i] = primeSum;
        }
    }

    public static void main(String args[]) {
        int lr = 100, ur = 1000;
        findSum();
        System.out.println("The sum of all the prime number : " + (numbers[ur] - numbers[lr - 1]));
    }
}
