package session4;

public class IncrementVsDecrement {

    public static void main(String[] args) {

        // ==========================================
        // 1. POST-INCREMENT (a++)
        // ==========================================

        int a = 1;

        // Post-increment:
        // 1. The current value of a (1) is used in the expression.
        // 2. The value of a is then incremented by 1.
        // 3. The result of the expression is assigned to 'result'.
        //
        // result = 1 + 2 = 3
        // a = 2
        int result = a++ + 2;

        System.out.println("Post-increment result: " + result); // 3
        System.out.println("Value of a after post-increment: " + a); // 2


        // ==========================================
        // 2. PRE-INCREMENT (++a)
        // ==========================================

        int b = 1;

        // Pre-increment:
        // 1. The value of b is incremented by 1.
        // 2. The new value of b (2) is used in the expression.
        //
        // result = 2 + 2 = 4
        // b = 2
        int result2 = ++b + 2;

        System.out.println("Pre-increment result: " + result2); // 4
        System.out.println("Value of b after pre-increment: " + b); // 2


        // ==========================================
        // 3. POST-INCREMENT VS PRE-INCREMENT
        // ==========================================

        int x = 2;

        // x++ returns the current value (2), then increments x to 3.
        System.out.println("x++: " + x++); // 2

        // x has already been incremented.
        System.out.println("x after x++: " + x); // 3

        // ++x increments x first (3 -> 4), then returns the new value.
        System.out.println("++x: " + ++x); // 4

        // x remains 4 after the expression.
        System.out.println("x after ++x: " + x); // 4


        // ==========================================
        // 4. POST-DECREMENT (x--)
        // ==========================================

        int y = 5;

        // Post-decrement:
        // The current value (5) is used first.
        // Then y is decremented to 4.
        System.out.println("y--: " + y--); // 5

        System.out.println("y after y--: " + y); // 4


        // ==========================================
        // 5. PRE-DECREMENT (--y)
        // ==========================================

        // Pre-decrement:
        // y is decremented first (4 -> 3).
        // Then the new value is used.
        System.out.println("--y: " + --y); // 3

        System.out.println("y after --y: " + y); // 3


        // ==========================================
        // 6. INCREMENT OPERATORS INSIDE EXPRESSIONS
        // ==========================================

        int number = 4;

        // Java evaluates operands from left to right.
        // First number++ returns 4, then number becomes 5.
        // Next number++ returns 5, then number becomes 6.
        //
        // result3 = 4 + 5 = 9
        // number = 6
        int result3 = number++ + number++;

        System.out.println("Result of number++ + number++: " + result3); // 9
        System.out.println("Value of number: " + number); // 6

        // Although this example is useful for understanding evaluation order,
        // avoid multiple increment/decrement operations on the same variable
        // in a single expression in production code.
        // Separate statements make the code easier to read and understand.

    }
}
