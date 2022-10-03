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

        return -1;
    }
}
