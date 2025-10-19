public class test {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            factorial *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }
        System.out.println(" = " + factorial);
    }
}
