package com.cs.solutions;

public class JavaInheritanceII {

    public static String describe() {
        Adder adder = new Adder();
        return "My superclass is: " + adder.getClass().getSuperclass().getSimpleName() + "\n"
                + adder.add(10, 32) + " " + adder.add(5, 8) + " " + adder.add(7, 13);
    }

    static class Arithmetic {
        public int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {
    }
}
