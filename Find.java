public class Find {
    public static int calculatePin(int input1, int input2, int input3, int input4) {

        int maxDigitInput1 = getMaxDigit(input1);
        int minDigitInput1 = getMinDigit(input1);
        int maxDigitInput2 = getMaxDigit(input2);
        int minDigitInput2 = getMinDigit(input2);
        int maxDigitInput3 = getMaxDigit(input3);
        int minDigitInput3 = getMinDigit(input3);
        int pin = ((maxDigitInput1 * minDigitInput1 * maxDigitInput2 * minDigitInput2)
                * (maxDigitInput3 * minDigitInput3)) - input4;

        return pin;
    }
    private static int getMaxDigit(int number) {
        int maxDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        return maxDigit;
    }

    private static int getMinDigit(int number) {
        int minDigit = 9;
        while (number > 0) {
            int digit = number % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            number /= 10;
        }
        return minDigit;
    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        int input4 = 38;

        int pin = calculatePin(input1, input2, input3, input4);
        System.out.println("PIN: " + pin);
    }
}
