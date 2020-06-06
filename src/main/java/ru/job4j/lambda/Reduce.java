package ru.job4j.lambda;

import java.util.function.*;
public class Reduce {

    private static int loop(int to, BiFunction<Integer, Integer, Integer> func, Supplier<Integer> initValue) {
        int rsl = initValue.get();
        for (int i = 1; i <= to; i++) {
            rsl = func.apply(rsl, i);
        }
        return rsl;
    }

    public static int summation(int to) {
        BiFunction<Integer, Integer, Integer> func = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        Supplier<Integer> initValue = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 0;
            }
        };
        return loop(to, func, initValue);
    }

    public static int multiplication(int to) {
        BiFunction<Integer, Integer, Integer> func = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer * integer2;
            }
        };

        Supplier<Integer> iniValue = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 1;
            }
        };
        return loop(to, func, iniValue);
    }
}
