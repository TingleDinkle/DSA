// =============================================================
// Figures 33–35: Factorial — Memory Stack / Call Stack Demo
// =============================================================

public class FactorialDemo {

    // Figure 33: Factorial function
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("factorial(" + n + ") = " + result);
    }
}

// ---- Figure 34: Stack visualization (winding) ----
/*
Call Stack (growing):

| factorial(1)  |  <-- top (base case)
| factorial(2)  |
| factorial(3)  |
| factorial(4)  |
| factorial(5)  |  <-- bottom (initial call)
+--------------+
*/

// ---- Figure 35: Stack visualization (unwinding) ----
/*
Unwinding:

factorial(1) returns 1
factorial(2) returns 2 * 1 = 2
factorial(3) returns 3 * 2 = 6
factorial(4) returns 4 * 6 = 24
factorial(5) returns 5 * 24 = 120

Final result: 120
*/

// ---- Expected Output ----
/*
factorial(5) = 120
*/
