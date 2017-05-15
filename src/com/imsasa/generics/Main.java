package com.imsasa.generics;

public class Main {

    private static UnaryFunction<Object> IDENTITY_FUNCTION = arg -> arg; // return same element - F(x) = x - identity function


    public static void main(String[] args) {

        // check identity functional object
        String[] strings = {"String 1", "String 2", "String 3"};
        UnaryFunction<String> identityString = identityFunction();
        for (String s : strings)
            System.out.println(identityString.applyFunction(s));
        Number[] numbers = {1, 3.5, 3L};
        UnaryFunction<Number> identityNumber = identityFunction();
        for (Number n : numbers)
            System.out.println(identityNumber.applyFunction(n));

    }

    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTITY_FUNCTION;
    }

}
