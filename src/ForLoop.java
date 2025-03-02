public class ForLoop {
    static void run() {
        for (int k = 2; k <= 10; k = k + 1) {
            System.out.println(k * 2);

            if (k > 4) {
                System.out.println("more_than_4 =" + k);
            } else {
                System.out.println("less_or_=" + k);
            }
        }

    }
}