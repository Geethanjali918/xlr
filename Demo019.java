public class Demo19 {
    public static int[] getFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println(0);
            return new int[]{};
        }
        int[] fibonacciSeries = new int[n];
        fibonacciSeries[0] = 0;
        if (n > 1) {
            fibonacciSeries[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        return fibonacciSeries;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] result = getFibonacciSeries(n);
        if (result.length > 0) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
                if (i < result.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}

