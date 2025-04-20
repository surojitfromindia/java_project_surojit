public class Func1 {
    static int addone(int l) {
        return l + 3;
    }

    static boolean isEven(int k) {
        return k % 2 == 0;
    }

    static boolean isOdd(int m) {
        return m % 2 != 0;
    }

    static int sum(int f, int b) {
        return f + b;


    }


    static int subtract(int l, int o) {
        return l - o;
    }

    static int multiplication(int g, int d) {
        return g * d;
    }

    static int division(int num, int divisor) {
        if (divisor == 0) {
            return num;
        } else {
            return num / divisor;
        }
    }

    static int abs(int u) {
        if (u < 0) {
            return u * -1;
        } else {
            return u;
        }
    }

    static int calculate(char operation, int n, int l) {

        if (operation == '+') {
            return n + l;
        } else if (operation == '*') {
            return n * l;
        } else if (operation == '/') {
            return Func1.division(n, l);
        } else {
            return n - l;
        }

    }

    static double math(double l, double i, double m) {

        return l + i - m;

    }


    static String weekDays(int g) {
        if (g == 1) {
            return "Monday";
        } else if (g == 2) {
            return "Tuesday";
        } else if (g == 3) {
            return "Wednesday";
        } else if (g == 4) {
            return "Thursday";
        } else if (g == 5) {
            return "Friday";
        } else if (g == 6) {
            return "Saturday";
        } else if (g == 7) {
            return "Sunday";
        } else {
            return "day not found";
        }
    }


    static int countHowManyElements(int[] elements) {
        return elements.length;
    }

    static String compareArray(int[] a1, int[] a2) {
        int a1Count = a1.length;
        int a2Count = a2.length;

        if (a1Count < a2Count) {
            return "2nd is bigger";
        }
        if (a2Count < a1Count) {
            return "1st is bigger";
        } else {
            return "both are equal length";

        }


    }

    static void run() {

//        int c = Func1.addone(10);
//        System.out.println(c);
//
//
//        boolean g = Func1.isEven(25);
//        System.out.println(g);
//
//        boolean d = Func1.isOdd(22);
//        System.out.println(d);
//
//
//        int s = Func1.sum(22, 90);
//        System.out.println(s);
//
//        int k = Func1.subtract(80, 49);
//        System.out.println(k);
//
//        int v = Func1.multiplication(90, 50);
//        System.out.println(v);
//
//        int j = Func1.division(100, 0);
//        System.out.println(j);
//
//
//        int h = Func1.calculate('+', 10, 7);
//        System.out.println(h);
//
//        h = Func1.calculate('*', 11, 70);
//        System.out.println(h);
//
//        h = Func1.calculate('/', 1000, 700);
//        System.out.println(h);
//
//        h = Func1.calculate('-', 10, 7);
//        System.out.println(h);
//
//
//        int n = Func1.abs(-10);
//        System.out.println(n);
//
//        double pop = Func1.math(0.009, 89.99, 0.890);
//        System.out.println(pop);

        String day = Func1.weekDays(15);
        System.out.println(day);


        int[] rou = {667, 765, 74};
        System.out.println(Func1.countHowManyElements(rou));


        int[] number = {2789, 5645, 4565, 355, 3454, 34546};

        System.out.println(Func1.compareArray(number, rou));
    }
}