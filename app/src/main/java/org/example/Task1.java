package org.example;

// ітераційний

public class Task1 {
    static int iterativeFibonacci(int n) {
        if (n <= 1) return n;

        int a = 0;
        int b = 1;
        int c;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}

// Часова складність O(n)
// Просторова складність O(1)
