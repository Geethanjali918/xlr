class LTcode007 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        LTcode007 solution = new LTcode007();  // Create an instance of LTcode007

        int[] result1 = solution.plusOne(new int[] {1, 2, 3});
        System.out.println("Result 1: " + java.util.Arrays.toString(result1));  // Output: [1, 2, 4]

        int[] result2 = solution.plusOne(new int[] {4, 3, 2, 1});
        System.out.println("Result 2: " + java.util.Arrays.toString(result2));  // Output: [4, 3, 2, 2]

        int[] result3 = solution.plusOne(new int[] {9});
        System.out.println("Result 3: " + java.util.Arrays.toString(result3));  // Output: [1, 0]
    }
}
