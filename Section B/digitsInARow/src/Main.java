public class Main {

    public static void main(String[] args) {
        testMethod(346696777);
        testMethod(0);
        testMethod(456);
        testMethod(9907);
    }

    private static void testMethod(int x){
        System.out.println("\"" + x + "\" has " + digitsInARow(x) + " digits in a row");
    }

    private static int digitsInARow(int num){
        if (num < 0) num = num * -1;
        if (num < 10) return 1; // 0 - 9
        int max = 1;
        int count = 1;
        while (num > 10) {
            int d1 = num % 10;
            int d2 = (num / 10) % 10;
            if (d1 == d2) {
                count++;
                if (max < count) max = count;
            } else {
                count = 1;
            }
            num /= 10;
        }

        return max;
    }
}
