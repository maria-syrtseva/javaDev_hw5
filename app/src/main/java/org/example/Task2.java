package org.example;

// рекурсивний

public class Task2 {
    static int recursiveFibonacci(int n) {
        if (n <= 1) return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}

// Часова складність O(2^n)
// Просторова складність O(n)