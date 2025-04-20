public class ForLoop {
    static void run() {
        // example 1:
        /*
         * loop start from 2 and upto 10, step by 1
         * if k is more than 4 print "more_than_4 ="
         * else print "less_or_="
         */
        for (int k = 2; k <= 10; k = k + 1) {
            System.out.println(k * 2);
            if (k > 4) {
                System.out.println("more_than_4 =" + k);
            } else {
                System.out.println("less_or_=" + k);
            }
        }


        // excersise : 1
        // write a for loop to print your name 3 times
        for (int l= 1;l<=3;l = l+1){
            System.out.println("Debanjan");
        }

        // excersise : 2
        // write a for loop starting from 2 and upto 10,
        // and print its value.
        for (int p=2; p<=10;p=p+1){
            System.out.println(p);
        }



        // excersise : 3
        // loop over 10 times
        // if number is even print even
        // else print odd.
        for (int h=0;h<=10;h=h+1){
            if (h%2==0){
                System.out.println("even");
            }else {
                System.out.println("odd");
            }
        }






    }
}