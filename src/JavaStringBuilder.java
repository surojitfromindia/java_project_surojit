public class JavaStringBuilder {

    static void run() {
        var n = new StringBuilder(32);

        var n2 =n.append("Stupid people tends to have argument that only they thinks are better that you")
                .appendCodePoint(128512);

        n2.codePoints().forEach(System.out::println);

        System.out.println(n);
    }


}
