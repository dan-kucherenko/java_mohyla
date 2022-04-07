public class Stopwatch {
    private long start;

    public void startTime() {
        start = System.nanoTime();
    }

    public double elapsedTime() {
        long now = System.nanoTime();
        return (now - start) / 1000;
    }
}