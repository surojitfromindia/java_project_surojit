public class JavaArray {
    static void run() {


        double[] hi = {1.2, 3.4, 6.5, 3.4, 9.0};
        System.out.println(hi[1]);
        System.out.println(hi[4]);

        System.out.println(hi.length);
        System.out.println(hi[hi.length - 1]);


        String[] evenNumbers = {"s", "a", "c", "d", "s"};
        System.out.println(evenNumbers[evenNumbers.length / 2]);


        int[][] matrix = new int[3][3];

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrix2[2][2]);
        System.out.println(matrix2[matrix2.length / 2][matrix2.length / 2]);


        int[][] matrix3 = {
                {1, 2, 3, 4, 5},
                {10, 11, 13, 15, 20},
                {2, 5, 6, 8, 3}
        };
        System.out.println(matrix3[matrix3.length / 2][matrix3[0].length / 2]);


        String[] day = {"sun", "mon", "tui"};
        System.out.println(day.length);

    }
}