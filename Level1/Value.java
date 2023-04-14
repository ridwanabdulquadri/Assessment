package Level1;

public class Value {
    public static void main(String[] args) {
        double result = 0;
        int j = 1;
        int k = 1;
        int term = 0;
        for (int i = 1; i <= 200000; i ++) {

            if ((i % 2) != 0) {
                result += (double) 4 / j;
                j += 2;
            } else {
                result -= (double) 4 / j;
                j += 2;
            }

            if (k != 0) {

                if (result > 3.14158 && result < 3.14159) {
                    term = i;
                    k = 0;
                }
            }

            System.out.printf("%f\n", result);
        }

    }
}