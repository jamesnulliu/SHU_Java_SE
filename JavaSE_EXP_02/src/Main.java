public class Main {
    public static void main(String[] args) {
        System.out.println("[TEST 1]");
        InputScanner scanner = new InputScanner();
        scanner.test1();

        System.out.println("[TEST 2]");
        whoMod3is0 mod = new whoMod3is0();
        mod.test2();

        System.out.println("[TEST 3]");
        paperScissorsStone pss = new paperScissorsStone();
        pss.test3();

        System.out.println("[TEST 4]");
        Test4 t4 = new Test4();
        t4.test4();
    }
}

class Test4 {
    void test4() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break;
                    // continue;
                }
                count++;
            }
        }
        System.out.println(count);
    }
}