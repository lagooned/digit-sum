
package com.jaredengler;

public class App {
    public static void main(final String[] args) {
        final DigitSummer digitSummer = new DigitSummer();
        final Integer n = 111;
        final Integer reducedSum = digitSummer.reducedSum(n);
        System.out.println(reducedSum);
    }
}
