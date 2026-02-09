package algorithms;

public class Timer {
    public static long timeSearch(Runnable searchTask) {
        long start = System.nanoTime();
        searchTask.run();
        long end = System.nanoTime();
        return end - start;
    }

    public static long timeSort(Runnable sortTask) {
        long start = System.nanoTime();
        sortTask.run();
        long end = System.nanoTime();
        return end - start;
    }
}
