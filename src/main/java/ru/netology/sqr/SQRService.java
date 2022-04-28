package ru.netology.sqr;

public class SQRService<count> {
    public static int calculate( int min, int max) {
        int i;
        int count = 0;
        for (i = 10; i <= 99; i++) {
            int j = i * i;
            if (j > max) {
                continue;
            }
            if (j < min) {
                continue;
            }
            count++;
        }

        return count;
    }
}
