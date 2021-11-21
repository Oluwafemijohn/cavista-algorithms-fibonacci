package com.example.cavista_interview


/**
 * Please code your solution in this class.
 */
class Fib {

    companion object{
        fun fibonacci(n: Int): Int{
            return when (n) {
                0 -> {
                    0
                }
                1, 2 -> {
                    1
                }
                else -> {
                    (fibonacci(n-1) + fibonacci(n -2))
                }
            }
        }
    }

    /**
     * TODO -- Instructions
     * Given an integer, return the nth element in the Fibonacci Sequence.
     * The Fibonacci Sequence begins with 0 and 1 as its first and second elements.
     * Each subsequent element is equal to the sum of the previous two elements.
     * ----------------------------
     * Constraints: n >= 0 && n <= 30
     * ----------------------------
     * Do not change method name / signature in any way
     * ----------------------------
     * ==Example==
     * Input: 5
     * Output: 5
     * Explanation: The value in the sequence at n = 5 is 5
     * [0, 1, 1, 2, 3, 5, 8]
     * ---------------^
     * See test cases for more examples and to verify your solution!
     * @param n
     * @return
     */

}

