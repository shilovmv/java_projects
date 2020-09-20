package sort;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] m = {11, 3, 14, 16, 7};
        int buf;

        for (int i = m.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (m[j] > m[j + 1]) {
                    buf = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = buf;
                }
            }
        }

        System.out.println(Arrays.toString(m));
    }
}
