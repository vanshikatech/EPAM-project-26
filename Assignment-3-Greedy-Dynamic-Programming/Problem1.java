import java.io.*;
import java.util.*;

public class ScholarshipDistribution {

    private static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) {
                    return -1;
                }
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) {
                    return -1;
                }
            }

            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }

            long value = 0;
            while (c > ' ') {
                value = value * 10 + (c - '0');
                c = read();
            }

            return value * sign;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        int n = fs.nextInt();
        long budget = fs.nextLong();

        int[] scholarships = new int[n];

        for (int i = 0; i < n; i++) {
            scholarships[i] = fs.nextInt();
        }

        Arrays.sort(scholarships);

        long used = 0;
        int count = 0;

        for (int amount : scholarships) {
            if (used + amount > budget) {
                break;
            }
            used += amount;
            count++;
        }

        System.out.println(count);
    }
}
