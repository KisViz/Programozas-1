public class Kepkeret {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            max = Math.max(Integer.parseInt(args[i]), max);
            min = Math.min(Integer.parseInt(args[i]), min);

        }
        System.out.println(max - min);


        // megoldas
    }

}