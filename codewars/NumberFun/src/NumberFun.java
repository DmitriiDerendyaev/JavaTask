public class NumberFun {
    public static long findNextSquare(long sq) {
        double bufferSq;
        if (Math.sqrt(sq) % 1 == 0) {
            return (long) Math.pow(Math.sqrt(sq) + 1, 2);
            //bufferSq = Math.sqrt(sq);
        } else return -1;
    }
}