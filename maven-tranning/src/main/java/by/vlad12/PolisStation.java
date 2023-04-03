package by.vlad12;

public class PolisStation {
    public int summarizeTwoCrines(int first, int second) {
        if (first == 0) {
            return 0;
        }
        if (first == 1) {
            return (int) (second * 0.5);
        }
        if (first == 2) {
            return (int) (second * 0.9);
        }
        return -1;
    }
}
