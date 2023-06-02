public class whoMod3is0 {
    public void test2() {
        System.out.println("All the positive integers in [1,100] which mod 3 is 0 are:");
        for (int i = 1; i <= 100; ++i) {
            if (i % 3 == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }
}
