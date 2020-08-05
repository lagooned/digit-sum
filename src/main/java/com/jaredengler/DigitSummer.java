
package com.jaredengler;

import java.util.ArrayList;
import java.util.List;

public class DigitSummer {

    public Integer reducedSum(final Integer n) {
        final List<String> chars = createArrayOfCharsFrom(n);
        final Integer totalSum = reducedDigitalSum(chars);
        return totalSum;
    }

    List<String> createArrayOfCharsFrom(final Integer n) {
        final List<String> digits = new ArrayList<String>();
        for (final char c : n.toString().toCharArray()) digits.add(String.valueOf(c));
        return digits;
    }

    Integer reducedDigitalSum(final List<String> chars) {
        if (chars.size() == 1)
            return Integer.valueOf(chars.get(0));
        final Integer partialSum = digitalSum(chars);
        return reducedDigitalSum(createArrayOfCharsFrom(partialSum));
    }

    Integer digitalSum(final List<String> chars) {
        final Integer partialSum = chars.stream()
            .map(c -> Integer.valueOf(c))
            .reduce(0, (acc, next) -> acc + next);
        return partialSum;
    }

}
